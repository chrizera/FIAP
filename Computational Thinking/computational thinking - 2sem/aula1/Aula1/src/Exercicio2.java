import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String[] nome = new String[10];
		int i;
		Scanner leitura = new Scanner(System.in);
		String nomeExtra = new String();
		
		for(i = 0; i < 10; i++){
			System.out.println("Digite o " + (i+1) + " nome:");
			nome[i] = leitura.nextLine().toLowerCase();
		}
		
		System.out.println("Digite o nome para procurar no vetor: ");
		nomeExtra = leitura.nextLine().toLowerCase();
		
		for(i = 0; i < 10; i++){
			if(nomeExtra.equals(nome[i]))
				System.out.println("Achei - posi��o " + (i+1));
			else 
				System.out.println("N�o achei.");
		}
		leitura.close();
	}

}
