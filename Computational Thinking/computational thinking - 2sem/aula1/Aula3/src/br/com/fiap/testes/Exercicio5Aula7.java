package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio5Aula7 {

	public static void main(String[] args) {
      String nomeProduto[] = new String[12];
      String nomeLoja[] = new String[5];
      int i = 0;
      Scanner entrada = new Scanner(System.in);
      
      for (i = 0; i < 12; i++){
    	  System.out.println("Digite o nome do produto "+(i+1)+": ");
    	  nomeProduto[i] = entrada.next();
      }
      for(i = 0; i < 5; i++){
    	  System.out.println("Digite o nome da loja "+(i+1)+": ");
    	  nomeLoja[i] = entrada.next();
      }
      
      int matriz[][] = new int [12][5];
      int j = 0;
      
      for(i = 0; i < 12; i++){
    	  System.out.println("----- Produto: "+nomeProduto[i]+" -----");
    	  for(j = 0; j < 5; j++){
    		  System.out.println("Informe o pre�o na loja "+nomeLoja[j]+": ");
    		  matriz[i][j] = entrada.nextInt();
    	  }
      }
      int maiorPreco = matriz[0][0];
      int menorPreco = matriz[0][0];
      int contMaiorLoja = 0,contMaiorProduto = 0, contMenorLoja = 0, contMenorProduto = 0;
      
      for(i = 0; i < 12; i++){
    	  for(j = 0; j < 5; j++){
    		  if(maiorPreco < matriz[i][j]){
    			  maiorPreco = matriz[i][j];
    			  contMaiorProduto = i;
    			  contMaiorLoja = j;
    		  }
    		  if(menorPreco > matriz[i][j]){
    			  menorPreco = matriz[i][j];
    			  contMenorProduto = i;
    			  contMenorLoja = j;
    		  }
    	  }
      }
      System.out.println("----------------------");
      System.out.println("Produto mais barato: " + nomeProduto[contMenorProduto]);
      System.out.println("Loja: " + nomeLoja[contMenorLoja]);
      System.out.println("Pre�o: " + matriz[contMenorProduto][contMenorLoja]);
      System.out.println("Produto mais caro: " + nomeProduto[contMaiorProduto]);
      System.out.println("Loja: " + nomeLoja[contMaiorLoja]);
      System.out.println("Pre�o: " + matriz[contMaiorLoja][contMaiorProduto]);
      
      entrada.close();
	}

}
