
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("terno");
		Produto p2 = new Produto("cinto");
		Produto p3 = new Produto("gravata");

		p1.adicionarProdutoAssociado(p2);
		p1.adicionarProdutoAssociado(p3);

		System.out.println(p1.getNomesProdutosAssociados());
		System.out.println(p1.getNome());
	}

}
