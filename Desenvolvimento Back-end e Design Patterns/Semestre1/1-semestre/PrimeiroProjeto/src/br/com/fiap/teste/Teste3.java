package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Fabricante;
import br.com.fiap.modelo.Produto;

public class Teste3 {

	public static void main(String[] args) {
		Fabricante objFabricante = new Fabricante();
		objFabricante.setNome(JOptionPane.showInputDialog("Digite o nome do fabricante: "));
		objFabricante.setEmail(JOptionPane.showInputDialog("Digite o email do fabricante: "));
		objFabricante.setFone(JOptionPane.showInputDialog("Digite o telefone fabricante: "));
		
		Produto objProduto = new Produto();
		objProduto.setDescricao(JOptionPane.showInputDialog("Digite a descri��o do produto: "));
		objProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto: ")));
		objProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		objProduto.setMarca(objFabricante);
		JOptionPane.showMessageDialog(null, "Descri��o: " + objProduto.getDescricao());
		JOptionPane.showMessageDialog(null, "C�digo: " + objProduto.getCodigo());
		JOptionPane.showMessageDialog(null, "Valor: " + objProduto.getValor());
		JOptionPane.showMessageDialog(null, "Nome da marca: " + objProduto.getMarca().getNome());
		
		Produto objProduto2 = new Produto ();
		objProduto2.setTudo
		(Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto: ")),
				JOptionPane.showInputDialog("Digite a descri��o do produto: "),
				objFabricante, 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: ")));
		JOptionPane.showMessageDialog(null, "Descri��o: " + objProduto2.getDescricao());
		JOptionPane.showMessageDialog(null, "C�digo: " + objProduto2.getCodigo());
		JOptionPane.showMessageDialog(null, "Valor: " + objProduto2.getValor());
		JOptionPane.showMessageDialog(null, objProduto2.getMarca().getTudo());
	}

}
