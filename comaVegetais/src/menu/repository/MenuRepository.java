package menu.repository;

import java.util.List;
import produtos.model.Produtos;

public interface MenuRepository {
	
	//em construção

    void exibirProdutos();
    void fazerPedido();
    void exibirSobreNos();

    Produtos pesquisarProduto(int codigo);
    void atualizarQuantidadeCompra(Produtos produto, int quantidade);
}
