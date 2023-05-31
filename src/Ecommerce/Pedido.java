package Ecommerce;

import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Produto> produtos;
	
	public Pedido(Cliente cliente, List<Produto> produtos) {
		this.cliente = cliente;
		this.produtos = produtos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido do Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Produtos:\n");
        for (Produto produto : produtos) {
            sb.append("* ").append(produto.getNome()).append("\n");
        }
        return sb.toString();
    }
}


