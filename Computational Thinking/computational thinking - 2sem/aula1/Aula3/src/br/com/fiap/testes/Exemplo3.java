package br.com.fiap.testes;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        double matriz[][] = new double[10][4];
        int i = 0, j = 0;
        
        for(i = 0; i < 3; i++){
        	System.out.println("Aluno " + (i+1));
        	for(j = 0; j < 3; j++){
        		System.out.println("Informe a nota da " + (j+1) + "a prova: ");
        		matriz[i][j] = entrada.nextDouble();
        		matriz[i][3] = matriz[i][3] + matriz[i][j];
        	}
        }
        for(i = 0; i < 3; i++){
        	System.out.println("Aluno " + i + "\nM�dia: " + matriz[i][3]/3);
        }
        
        entrada.close();
	}

}
