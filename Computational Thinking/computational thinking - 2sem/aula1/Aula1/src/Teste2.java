import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nome = new String[3];
		float[] temperatura = new float[3];
		Scanner leitura = new Scanner(System.in);
		int i;
		
		for(i = 0; i < 3; i++){
			System.out.println("Digite o nome: ");
			nome[i] = leitura.next();
			System.out.println("Digite a temperatura: ");
			temperatura[i] = leitura.nextFloat();
		}
		
	    for(i = 0; i < 3; i++){
	    	if(temperatura[i] > 37){
	    		System.out.println("O paciente " + nome[i] + " est� com febre.");
	    	}
	    }
	    leitura.close();
	}

}
