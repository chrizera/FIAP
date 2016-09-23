package br.com.fiap.beans;

public class Medio extends Formacao{
 private String tipo;

 public String getTipo() {
	 return tipo;
 }

 public void setTipo(String tipo) {
	 this.tipo = tipo;
 }

 public Medio(String tipo, String descricao, int periodo, double mensalidade) {
	 super(descricao, periodo, mensalidade);
	 this.tipo = tipo;
 }

 public Medio() {
	 super();
 }
 public String getTudo(){
	 return tipo + "\n" + super.getTudo();
 }
 public void calcularMensalidade(double fator){
	super.setMensalidade(super.getDuracao()*fator*500); 
 }
}