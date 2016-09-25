package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static double calculoImposto(double cargaCaminhao){
		Scanner entrada = new Scanner(System.in);
		int codigoImposto = 0;
		System.out.println("Codigo d imposto: ");
		codigoImposto = entrada.nextInt();

		switch (codigoImposto){
		case 1:
			cargaCaminhao = cargaCaminhao*1.25;
		case 2:
			cargaCaminhao = cargaCaminhao*1.20;
		case 3:
			cargaCaminhao = cargaCaminhao*1.15;
		case 4:
			System.out.println("sem alteracao");
		default:
			System.out.println("erro");
		}
		
		entrada.close();

		return cargaCaminhao;
	}

	public static double conversaoPeso(double cargaCaminhao){
		Scanner entrada = new Scanner(System.in);
		int codigoCarga = 0;

		System.out.println("Codigo da carga: ");
		codigoCarga = entrada.nextInt();

		if(codigoCarga >= 1 && codigoCarga <= 10){
			cargaCaminhao = cargaCaminhao*1000*120;
		}
		else if(codigoCarga >= 11 && codigoCarga <= 20){
			cargaCaminhao = cargaCaminhao*1000*200;
		}
		else {
			cargaCaminhao = cargaCaminhao*1000*280;
		}

		entrada.close();

		return cargaCaminhao;
	}

	public static void main(String[] args) {
		//int codigoCaminhao = 0;
		double cargaCaminhao = 0;
		Scanner entrada = new Scanner(System.in);

		//System.out.println("Codigo caminhao: ");
		//codigoCaminhao = entrada.nextInt();

		System.out.println("Peso carga: ");
		cargaCaminhao = entrada.nextDouble();

		double cargaConvertida = conversaoPeso(cargaCaminhao);
		double imposto = calculoImposto(cargaConvertida);

		System.out.println(imposto);

		entrada.close();
	}

}
