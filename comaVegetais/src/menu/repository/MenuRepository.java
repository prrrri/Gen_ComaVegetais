package menu.repository;

import produtos.model.Produtos;

public interface MenuRepository {
	
	//CRUD do Menu
	//public void equivalente ao procurarPorNumero
	public void listarTodas;//ler os produtos do pedido
	public void atualizar;//limpar a quantidade ou produto anterior e inserir nova quantidade
	public void deletar;
	
	//métodos
	public void alterar quantidade(int quantidade);
	

}
