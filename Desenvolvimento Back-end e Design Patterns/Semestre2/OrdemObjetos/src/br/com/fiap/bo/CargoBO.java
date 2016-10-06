package br.com.fiap.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public abstract class CargoBO {


	public static void validarGravar(Cargo cargo, Connection conexao) throws Exception{
		if(cargo.getCargo().length() < 2) {
			throw new Excecao("Caracteres insuficientes em cargo");
		}
		if(cargo.getNivel().length() < 2) {
			throw new Excecao("Caracteres insuficientes em n�vel");
		}
		if(cargo.getSalario() < 700) {
			throw new Excecao("Sal�rio insuficiente");
		}
		new CargoDAO().gravar(cargo, conexao);
	}
	
	public static List<Cargo> validarGetLista(Connection conexao) throws Exception{
		return new CargoDAO().getLista(conexao);
	}
	
	public static List<Cargo> validarConsultar(String pCargo, Connection conexao) throws Exception {
		return new CargoDAO().consultar(pCargo.toUpperCase(), conexao);
	}
	
	public static void validarDeletar(String cargo, Connection conexao) throws Exception{
		if(cargo.length() < 2) {
			throw new Excecao("Caracteres insuficientes.");
		}
		new CargoDAO().deletar(cargo, conexao);
	}
	
	public static int validarAtualizarSalario(double aumento, Connection conexao) throws Exception {
		return new CargoDAO().atualizar(aumento, conexao);
	}
}
