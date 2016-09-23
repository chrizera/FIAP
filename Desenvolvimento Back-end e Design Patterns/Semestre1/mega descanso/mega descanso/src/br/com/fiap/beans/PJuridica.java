package br.com.fiap.beans;

public class PJuridica extends Pessoa{
 private String cnpj;
 private String url;
 private String contato;
 private int qtdeFuncionario;
 private double percentualDesconto;
 private int codigo;
 
 
 

public PJuridica() {
	super();
}

public PJuridica(String nome, String endereco, String telefone, String email, String cnpj, String url, String contato, int qtdeFuncionario, double percentualDesconto, int codigo) {
	super(nome, endereco, telefone, email);
	this.cnpj = cnpj;
	this.url = url;
	this.contato = contato;
	this.qtdeFuncionario = qtdeFuncionario;
	this.percentualDesconto = percentualDesconto;
	this.codigo = codigo;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getContato() {
	return contato;
}
public void setContato(String contato) {
	this.contato = contato;
}
public int getQtdeFuncionario() {
	return qtdeFuncionario;
}
public void setQtdeFuncionario(int qtdeFuncionario) {
	this.qtdeFuncionario = qtdeFuncionario;
}
public double getPercentualDesconto() {
	return percentualDesconto;
}
public void setPercentualDesconto(double percentualDesconto) {
	this.percentualDesconto = percentualDesconto;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
 
 
}
