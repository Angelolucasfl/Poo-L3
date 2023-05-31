package Ecommerce;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private String nome;
    private Endereco endereco;
    private List<Pedido> pedidos;
	
	public Cliente(String nome, String rua, String cidade, String estado) {
		this.nome = nome;
        this.endereco = new Endereco(rua, cidade, estado);
        this.pedidos = new ArrayList<>();
	}
	
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
	

}

