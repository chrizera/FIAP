package br.com.fiap.arquivos.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import br.com.fiap.arquivos.modelo.Produto;

public class TesteArquivo_Texto {
	
	static String gravarArquivo(Produto produto) throws Exception {
		FileWriter arquivo = new FileWriter("c:/temp/exemplo1.txt");
		PrintWriter dados = new PrintWriter(arquivo);
		
		dados.println(produto.getTudo());
		
		dados.close();
		arquivo.close();
		
		return "Gravado com sucesso.";
	}
	
	static String lerArquivo() throws Exception {
		FileReader arquivo = new FileReader("c:/temp/exemplo1.txt");
		BufferedReader dados = new BufferedReader(arquivo);
		String resultado = "";
		
		while(dados.ready()) {
			resultado += dados.readLine() + "\n";
		}
		
		dados.close();
		arquivo.close();
		
		return resultado;
	}

	public static void main(String[] args) throws Exception{
		Produto produto = new Produto("Positivo Dual Core XPTO", 
				"2ghz", "1GB", "CASAS X");
		
		System.out.println(gravarArquivo(produto));
		
		System.out.println(lerArquivo());
	}

}
