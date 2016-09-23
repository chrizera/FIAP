package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Bacharelado;
import br.com.fiap.beans.Formacao;
import br.com.fiap.beans.Medio;
import br.com.fiap.beans.Tecnologo;

public class Teste {
	static String texto(String a){
		return JOptionPane.showInputDialog(a);
	}
	static int inteiro(String a){
		return Integer.parseInt(JOptionPane.showInputDialog(a));
	}
	static double real(String a){
		return Double.parseDouble(JOptionPane.showInputDialog(a));
	}
	static boolean b(String a){
		return Boolean.parseBoolean(JOptionPane.showInputDialog(a));
	}

	public static void main(String[] args) {
	  Formacao obj = null;
	  String resposta = new String();
	  
	  resposta = JOptionPane.showInputDialog("1 para Tecn�logo"+"\n"+"2 para Bacharelado"+"\n"+"3 para Medio");
	  
	  if(resposta.equals("1")){
		obj = new Tecnologo(b("Plano estendido? "), texto("Descri��o: "), inteiro("Per�odo: "), real("Mensalidade: "));
		obj.setDuracao(obj);		
	  }	  
	  else if (resposta.equals("2")){
		  obj = new Bacharelado(texto("Projeto: "), inteiro("carga:"),texto("descri��o: "), inteiro("per�odo: "), real("Mensalidade"));
		  obj.setDuracao(obj);
	  }
	  else {
		  obj = new Medio(texto("tipo"), texto("descri��o"),inteiro("periodo"), real("mensalidade"));
		  obj.setDuracao(obj);
	  }
	  System.out.println(obj.getTudo());
	  
	}
}