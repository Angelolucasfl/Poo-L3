import java.util.List;
import java.util.ArrayList;

public class Produto {
	private String nome;
	private List<Produto> produtoAssociado;

	
	public Produto(String nome) {
		this.nome = nome;
		this.produtoAssociado = new ArrayList<>();
	}

	public void adicionarProdutoAssociado(Produto p) {
		produtoAssociado.add(p);
	}
	
    public List<String> getNomesProdutosAssociados() {
        List<String> nomes = new ArrayList<>();
        for (Produto produto : produtoAssociado) {
            nomes.add(produto.getNome());
        }
        return nomes;
    }

    public String getNome() {
        return nome;
    }
	
}