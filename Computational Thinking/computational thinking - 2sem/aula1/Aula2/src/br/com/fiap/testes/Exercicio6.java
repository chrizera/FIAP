package br.com.fiap.testes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String nome[] = new String[5];
     double salario[] = new double[5];
     int tempo[] = new int [5];
     int i = 0;
     Scanner leitura = new Scanner(System.in);
     
     for(i = 0; i < 5; i++){
    	 System.out.println("Digite o nome do funcion�rio: ");
    	 nome[i] = leitura.next();
    	 System.out.println("Digite o sal�rio: ");
    	 salario[i] = leitura.nextDouble();
    	 System.out.println("Digite o tempo: ");
    	 tempo[i] = leitura.nextInt();
    	 
     }
     System.out.println("FUNCION�RIOS QUE N�O TER�O AUMENTO: ");
     for(i = 0; i < 5; i++){
    	 if(tempo[i] < 5 && salario[i] > 780){
    		 System.out.println("Nome: " + nome[i]);
    	 }
     }
     System.out.println("FUNCION�RIOS QUE TER�O AUMENTO:");
     for(i = 0; i < 5; i++){
    	 if(tempo[i] > 5 && salario[i] < 780){
    		 salario[i] = salario[i]*1.35;
    		 System.out.println("Nome: " + nome[i] + " ---- Sal�rio: " + salario[i]);
    	 }
    	 else if(tempo[i] > 5){
    		 salario[i] = salario[i]*1.25;
    		 System.out.println("Nome: " + nome[i] + " ---- Sal�rio: " + salario[i]);
    	 }
    	 else if(salario[i] < 780){
    		 salario[i] = salario[i]*1.15;
    		 System.out.println("Nome: " + nome[i] + " ---- Sal�rio: " + salario[i]);
    	 }
     }
    
     
     leitura.close();
	}

}
