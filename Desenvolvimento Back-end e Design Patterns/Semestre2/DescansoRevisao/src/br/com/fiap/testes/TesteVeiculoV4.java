package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;

public class TesteVeiculoV4 {

	public static void main(String[] args) {
		Veiculo meusVeiculos[]=new Veiculo[5];
		int iVeiculo=0;
		do{
		int iAcessorio =0;
		Acessorio meusAcessorios[] = new Acessorio[3];
		while(JOptionPane.showConfirmDialog(null, "Lan�ar Acess�rios", "T�tulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0 && iAcessorio<3){
			meusAcessorios[iAcessorio]=new Acessorio(JOptionPane.showInputDialog("Descri��o do Acess�rio"),Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
			iAcessorio++;
		}
		meusVeiculos[iVeiculo]=new Veiculo(JOptionPane.showInputDialog("Digite a montadora"),Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")),Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),JOptionPane.showInputDialog("Digite o modelo"),meusAcessorios);
		iVeiculo++;
		}while(JOptionPane.showConfirmDialog(null, "+ Ve�culos", "T�tulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0 && iVeiculo<5);
		for (int v=0;v<iVeiculo;v++){
			System.out.println(meusVeiculos[v].getModelo()+"\n" + meusVeiculos[v].getMontadora() + "\nAcess�rios:");
			for(int a=0;a<meusVeiculos[v].getAcessorios().length;a++){
				System.out.println(meusVeiculos[v].getAcessorios()[a].getDescricao() + "\n" + meusVeiculos[v].getAcessorios()[a].getValor());
			}
		}
	}

}