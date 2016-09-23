package br.com.fiap.beans;

public class Bacharelado extends Formacao{
 private String projetoConclusao;
 private int cargaHorariaEstagio;
 public Bacharelado() {
	 super();
 }
 public Bacharelado(String projetoConclusao, int cargaHorariaEstagio, String descricao, int periodo, double mensalidade) {
	 super(descricao, periodo, mensalidade);
	 this.projetoConclusao = projetoConclusao;
	 this.cargaHorariaEstagio = cargaHorariaEstagio;
 }
 public String getProjetoConclusao() {
	 return projetoConclusao;
 }
 public void setProjetoConclusao(String projetoConclusao) {
	 this.projetoConclusao = projetoConclusao;
 }
 public int getCargaHorariaEstagio() {
	 return cargaHorariaEstagio;
 }
 public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
	 this.cargaHorariaEstagio = cargaHorariaEstagio;
 }
 public String getTudo() {
	 return projetoConclusao + "\n" + cargaHorariaEstagio + "\n" + super.getTudo();
 }
 public void calcularMensalidade (double fator){
     super.setMensalidade((super.getDuracao()*fator*600) + getCargaHorariaEstagio()*12);
 }
}