package br.com.fiap.beans;

public class Tecnologo extends Formacao{
 private boolean planoEstendido;

 public Tecnologo() {
	 super();
 }

/* public Tecnologo(boolean planoEstendido, String descricao, int periodo, double mensalidade, Formacao obj) {
	 super(descricao, periodo, mensalidade, obj);
	 this.planoEstendido = planoEstendido;
 }*/
 public Tecnologo(boolean planoEstendido, String descricao, int periodo, double mensalidade) {
	 super(descricao, periodo, mensalidade);
	 this.planoEstendido = planoEstendido;
 }

 public boolean isPlanoEstendido() {
	 return planoEstendido;
 }
 public String getTudo(){
	 return planoEstendido + "\n" + super.getTudo();
 }
 public void setPlanoEstendido(boolean planoEstendido) {
	 this.planoEstendido = planoEstendido;
 }
 
 public void calcularMensalidade (double fator){
	setMensalidade(getDuracao()*fator*600); 
 }
}