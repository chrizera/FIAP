package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;

public class TesteVeiculoV1 {

	public static void main(String[] args) {
		String strMontadora=JOptionPane.showInputDialog("Digite a montadora");
		String strModelo=JOptionPane.showInputDialog("Digite o modelo");
		double dblValor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		int intAno=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
		int resp=0;
		int iAcessorio =0;
		Acessorio meusAcessorios[] = new Acessorio[3];
		while(resp==0){
			String strDescricao=JOptionPane.showInputDialog("Descri��o do Acess�rio");
			double dblValorAcessorio=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
			meusAcessorios[iAcessorio]=new Acessorio();
			meusAcessorios[iAcessorio].setDescricao(strDescricao);
			meusAcessorios[iAcessorio].setValor(dblValorAcessorio);
			iAcessorio++;
			resp=JOptionPane.showConfirmDialog(null, "+ Acess�rios", "T�tulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		Veiculo v = new Veiculo();
		v.setAno(intAno);
		v.setModelo(strModelo);
		v.setMontadora(strMontadora);
		v.setValor(dblValor);
		v.setAcessorios(meusAcessorios);
	}

}
