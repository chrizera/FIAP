import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] numero = new float[10];
		Scanner leitura = new Scanner(System.in);
		float media = 0;
		int i;
		
		for(i = 0; i < 10; i++){
			System.out.println("Digite o n�mero: ");
			numero[i] = leitura.nextFloat();
			media = media + numero[i];
		}
		
		System.out.println("A m�dia �: " + (media/10));
		
		leitura.close();
	}
        
}
