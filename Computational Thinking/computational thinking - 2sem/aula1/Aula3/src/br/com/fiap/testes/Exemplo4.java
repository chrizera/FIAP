package br.com.fiap.testes;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        int codQuant[][] = new int[5][2];
        int i = 0, k = 0;
        double precoSub[][] = new double[5][2];
        double totalGeral = 0;
        
        for(i = 0; i < 5; i++){
        	//for(j = 0; j < 2; j++){
        		k = 0;
        		System.out.println("Digite o c�digo: ");
        		codQuant[i][k] = entrada.nextInt();
        		k++;
        	    System.out.println("Digite o pre�o: ");
        	    precoSub[i][k-1] = entrada.nextDouble();
        	    System.out.println("Digite a quantidade: ");
        	    codQuant[i][k] = entrada.nextInt();
        	    precoSub[i][k] = precoSub[i][k-1]*codQuant[i][k];
        	    totalGeral = totalGeral + precoSub[i][k];
        	//}
        }
        for(i = 0; i < 5; i++){
        	k = 0;
        	//for(j = 0; j < 2; j++){
        		System.out.println("C�digo: " + codQuant[i][k] + " - Pre�o: " + precoSub[i][k] + " - Quantidade: " + codQuant[i][k+1] + " - Subtotal: " + precoSub[i][k+1]);
        	//}
        }
        System.out.println("Total geral: " + totalGeral);
        entrada.close();
	}

}
