package produtos.model;

public class Produtos {
	
	private String nome;
	private String descricao;
	private double preco;
	private String categoria;
	private int quantidadeDisponivel;
	
	//método construtor
	public Produtos(String nome, String descricao, double preco, String categoria, int quantidadeDisponivel) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	//get and set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	//criando métodos específicos
	
	//boolean pq retorna true caso esteja disponível e false caso não esteja
	public boolean verificarDisponibilidade() {
		return quantidadeDisponivel > 0;
	}
	
	public void mostrarDetalhes() {
		System.out.println("\nNome: "+nome);
		System.out.println("\nDescrição: "+descricao);
		System.out.println("\nPreço: "+preco);
		System.out.println("\nCategoria: "+categoria);
		System.out.println("\nQuantidade Disponível: "+quantidadeDisponivel);
	}
}
	
	/* public void adicionarAoCarrinhO() {
		//lógica para adicionar o produto ao carrinho
		//pode ser atualizando a quantidade no carrinho 
		//ou adicionando o produto a uma lista de itens no carrinho
		System.out.println("\nProduto adicionado ao carrinho: " + nome);
	} else {
		System.out.println("\nProduto indisponível para compra.");
	}
	
    // Método para mostrar os produtos disponíveis
    public static void mostrarProdutosDisponiveis(Produtos[] produtos) {
        System.out.println("Produtos Disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].verificarDisponibilidade()) {
                System.out.println((i + 1) + ". " + produtos[i].getNome());

}
}
    }
}
*/