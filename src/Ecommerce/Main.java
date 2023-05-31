package Ecommerce;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("terno");
		Produto p2 = new Produto("cinto");
		Produto p3 = new Produto("gravata");

		p1.adicionarProdutoAssociado(p2);
		p1.adicionarProdutoAssociado(p3);

		System.out.println(p1.getNomesProdutosAssociados());
		System.out.println(p1.getNome());
		
		Cliente c1 = new Cliente("Bob", "Rua Senador Pompeu", "Fortaleza", "Ceará");
		List<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		Pedido pedido1 = new Pedido(c1, listaProdutos);
		
		
		c1.adicionarPedido(pedido1);
		System.out.println(c1.getNome());
		System.out.println(c1.getEndereco());
		System.out.println(c1.getPedidos());
	}

}
