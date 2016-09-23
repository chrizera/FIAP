package br.com.fiap.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static int calculoEstadia(int tipoAcomodacao, int quantidadeDiarias){
		switch (tipoAcomodacao) {
		case 1:
			return quantidadeDiarias*380;
		case 2:
			return quantidadeDiarias*450;
		case 3:
			return quantidadeDiarias*560;
		default: return 0;
		}
	}
	public static void solicitarFormaPagamento(String formaPagamento, String nome, int calculoEstadia){
		if(formaPagamento.toUpperCase().equals("V")){
			System.out.println(nome + calculoEstadia*0.9);
		}
		else {
			System.out.println(nome + calculoEstadia);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nome = new String();
		int tipoAcomodacao;
		int quantidadeDiarias;

		System.out.println("Tipo de acomoda��o: ");
		System.out.println("1 - Standard\n2 - Luxo\n3- Super Luxo");
		tipoAcomodacao = entrada.nextInt();
		
		System.out.println("Quantidade de di�rias: ");
		quantidadeDiarias = entrada.nextInt();
		
		solicitarFormaPagamento(JOptionPane.showInputDialog("V OU P"), nome, calculoEstadia(tipoAcomodacao, quantidadeDiarias));

		entrada.close();
	}

}
