package br.com.fiap.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static char[] validarSexo(){
		Scanner entrada = new Scanner(System.in);
		char sexo[] = new char[5];
		int i = 0;

		for (i = 0; i > 5; i++){
			System.out.println("sexo: ");
			sexo[i] = entrada.next().charAt(0);

			while(sexo[i] != 'M' || sexo[i] != 'F'){
				System.out.println("sexo: ");
				sexo[i] = entrada.next().charAt(0);
			}
		}
		
		entrada.close();
		
		return sexo;
	}
	
	public static char[] validarCorOlho(){
      Scanner entrada = new Scanner(System.in);
      int i = 0;
      char corOlho[] = new char[5];
      
      for(i = 0; i < 5; i++){
    	  System.out.println("cor dos olhos:");
    	  corOlho[i] = entrada.next().toUpperCase().charAt(0);
    	  
    	  while(corOlho[i] != 'A' || corOlho[i] != 'C'){
    		  System.out.println("cor dos olhos:");
        	  corOlho[i] = entrada.next().toUpperCase().charAt(0);  
    	  }
    	  
    	  entrada.close();
    	  
      }
      
      entrada.close();
      return corOlho;
	}
	public static char[] validarCorCabelo(){
	      Scanner entrada = new Scanner(System.in);
	      int i = 0;
	      char corCabelo[] = new char[5];
	      
	      for(i = 0; i < 5; i++){
	    	  System.out.println("cor dos cabelos: ");
	    	  corCabelo[i] = entrada.next().toUpperCase().charAt(0);
	    	  
	    	  while(corCabelo[i] != 'L' || corCabelo[i] != 'P' || corCabelo[i] != 'C'){
	    		  System.out.println("cor dos cabelos: ");
		    	  corCabelo[i] = entrada.next().toUpperCase().charAt(0);
	    	  }
	      }
	      entrada.close();
	      return corCabelo;
	}

	public static int mediaIdadeOlhoCastanhoCabeloPreto(int idade[], char corOlhos[], char corCabelos[]){
		int i = 0;
		int contador = 0;
		int media = 0;
		
		for(i = 0; i < 5; i++){
			if(corOlhos[i] == 'C' && corCabelos[i] == 'P'){
				contador++;
				media = media + idade[i];
			}
		}
		
		return media/contador;
	}
	
	public static int maiorIdade(int idade[]){
		int maiorIdade = idade[0];
		int  i = 1;
		
		for(i = 1; i < 5; i++){
			if(maiorIdade < idade[i]){
				maiorIdade = idade[i];
			}
		}
		
		return maiorIdade;
	}
	
	public static int quantidadeFemininoEntreIdadeOlhoAzulCabeloLouro(char sexo[], int idade[], char corOlhos[], char corCabelos[]){
		int i = 0;
		int quantidade = 0;
		
		for(i = 0; i < 5; i++){
			if(sexo[i] == 'F' && (idade[i] >= 18 && idade[i] <= 35) && corOlhos[i] == 'A' && corCabelos[i] == 'L'){
				quantidade++;
			}
		}
		
		return quantidade;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char sexo[] = validarSexo();
		char corOlhos[] = validarCorOlho();
		char corCabelos[] = validarCorCabelo();
		int idade[] = new int[5];
		int i = 0;
		
		for(i = 0; i< 5; i++){
			System.out.println("idade:");
			idade[i] = entrada.nextInt();
		}

		
		
		entrada.close();
	}

}
