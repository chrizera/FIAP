package br.com.fiap.testes;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.bo.CargoBO;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoBO {

	public static void main(String[] args) throws Excecao{
		try {
			Connection conexao = ConexaoFactory.controlarInstancia().getConnection("", "");
			Cargo cargo = new Cargo();

			do {
				cargo = new Cargo();
				cargo.setCargo(JOptionPane.showInputDialog("Cargo: "));
				cargo.setNivel(JOptionPane.showInputDialog("N�vel: "));
				cargo.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Sal�rio: ")));

				CargoBO.validarGravar(cargo, conexao);
			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Teste BO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0 );

			List<Cargo> lista = CargoBO.validarGetLista(conexao);

			for(Cargo objeto: lista) {
				System.out.println(objeto.getTudo());
			}

			lista = CargoBO.validarConsultar(JOptionPane.showInputDialog("Cargo para pesquisar: "), conexao);

			for(Cargo objeto: lista) {
				System.out.println(objeto.getTudo());
			}
		}
		catch(Exception e ){
			throw new Excecao("Falha.");
		}

	}
}
