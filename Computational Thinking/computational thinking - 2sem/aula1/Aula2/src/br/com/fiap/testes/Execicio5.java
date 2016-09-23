package br.com.fiap.testes;

import java.util.Scanner;

public class Execicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gabarito[] = new String[8];
		String resposta[] = new String[8];
		Scanner leitura = new Scanner(System.in);
		int i = 0, j = 0, nota = 0;
		double aprovados = 0;
		int aluno[] = new int[10];

		for (i = 0; i < 8; i++) {
			System.out.println("Digite a resposta da quest�o " + (i + 1));
			gabarito[i] = leitura.next().toLowerCase();
		}

		for (j = 0; j < 10; j++) {
			System.out.println("Digite o n�mero do aluno: ");
			aluno[j] = leitura.nextInt();
            
			nota = 0;
			
			for (i = 0; i < 8; i++) {
				System.out.println("Digite a resposta dada pelo aluno " + aluno[j] + " � quest�o " + (i + 1) + ":");
				resposta[i] = leitura.next().toLowerCase();

				if (resposta[i].equals(gabarito[i])) {
					nota++;
				}
			}
			if (nota >= 6) {
				aprovados++;
			}
			System.out.println("A nota do aluno " + aluno[j] + " �: " + nota);
		}
        System.out.println(aprovados);
		System.out.println("A porcentagem de aprovados � " + ((aprovados/10)*100) + "%");

		leitura.close();
	}

}
