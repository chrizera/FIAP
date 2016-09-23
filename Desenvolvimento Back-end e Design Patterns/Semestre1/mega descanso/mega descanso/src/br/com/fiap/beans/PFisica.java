package br.com.fiap.beans;

public class PFisica extends Pessoa{
 private String rg;
 private String cpf;
 
 
 
public PFisica() {
	super();
}
public PFisica(String rg, String cpf){
	this.rg = rg;
	this.cpf = cpf;
}
public PFisica(String nome, String endereco, String telefone, String email, String rg, String cpf) {
	super(nome, endereco, telefone, email);
	this.rg = rg;
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
 
 
}
