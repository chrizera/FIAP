import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		float[] temperatura = new float[7];
		int i, quant = 0;
		float media = 0;
		Scanner leitura = new Scanner(System.in);
		
		for (i=0; i < 7; i++){
			System.out.println("Digite a temperatura do " + (i+1 + " dia:"));
			temperatura[i] = leitura.nextFloat();
			media = media + temperatura[i];
		}
		
		media = media/7;
		
		for(i = 0; i < 7; i++){
			if(temperatura[i] > media) 
				quant++;
		}
		System.out.println("A m�dia �: " + media);
		System.out.println("Quantidade de dias com temperatura acima da m�dia: " + quant);
		leitura.close();
	}

}
