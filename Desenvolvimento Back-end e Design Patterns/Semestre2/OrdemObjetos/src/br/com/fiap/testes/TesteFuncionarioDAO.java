package br.com.fiap.testes;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.bo.CargoBO;
import br.com.fiap.bo.FuncionarioBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecoes.Excecao;

public class TesteFuncionarioDAO {

	public static void main(String[] args) throws Exception{
		Connection c = null;
		Funcionario f = null;
		try {
			c = ConexaoFactory.controlarInstancia().getConnection("", "");
			c.setAutoCommit(false);

			do {
				f = new Funcionario();
				f.setNome(JOptionPane.showInputDialog("Digite o nome: "));
				f.setCargo(CargoBO.validarConsultar(JOptionPane.showInputDialog("Digite o cargo: "), c));
				f.setDtAdmissao(Calendar.getInstance());
				System.out.println(f.getCargo().getCodigo());
				FuncionarioBO.gravar(c, f);
				System.out.println("Gravado");
			}while(JOptionPane.showConfirmDialog(null, "Continuar?", "T�tulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
			c.setAutoCommit(true);
			c.commit();
			
			for(Funcionario fun: FuncionarioBO.exibirTudo(c)) {
				System.out.println(fun.getNome() + "\n" + fun.getCodigo() + "\n" + new SimpleDateFormat("dd/MM/yyyy").format(fun.getDtAdmissao().getTime()) + "\n" + fun.getCargo().getCargo() + "\n\n");
			}
		}
		catch(Exception e) {
			c.rollback();
			e.printStackTrace();
			throw new Excecao("Deu ruim");
			
		}
		finally {
			try {
				c.close();
			}
			catch(Exception e){
				System.out.println("Fechando conexao");
				throw new Excecao("Nooo");
			}
		}
	}

}
