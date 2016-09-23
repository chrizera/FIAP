package br.com.fiap.beans;

public class Modalidade {
 private int codMod;
 private String descMod;
 private int dtInicio;
 private int dtTermino;
 
public Modalidade() {
	super();
}
public Modalidade(int codMod, String descMod, int dtInicio, int dtTermino) {
	super();
	this.codMod = codMod;
	this.descMod = descMod;
	this.dtInicio = dtInicio;
	this.dtTermino = dtTermino;
}
public int getCodMod() {
	return codMod;
}
public void setCodMod(int codMod) {
	this.codMod = codMod;
}
public String getDescMod() {
	return descMod;
}
public void setDescMod(String descMod) {
	this.descMod = descMod;
}
public int getDtInicio() {
	return dtInicio;
}
public void setDtInicio(int dtInicio) {
	this.dtInicio = dtInicio;
}
public int getDtTermino() {
	return dtTermino;
}
public void setDtTermino(int dtTermino) {
	this.dtTermino = dtTermino;
} 
}