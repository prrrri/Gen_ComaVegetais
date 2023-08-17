package menu.controller;

import produtos.model.Produtos;
import java.util.ArrayList;
import menu.repository.MenuRepository;

public class MenuController implements MenuRepository {
	
	public ArrayList<Produtos> Lista;
	
	@Override
	public void descricaoProdutos() {
		ArrayList<Produtos> Produtos = new ArrayList<Produtos>();
	
	Produtos.add(new Produtos ("Couve Kale","Prepare na air-fryer com azeite, páprica e sal. Parece um salgadinho.",4.50,"Hortaliças"));
	Produtos.add(new Produtos ("Cúrcuma","O mais poderosos antiinflamatório natural.",8.0,"Temperos"));
	Produtos.add(new Produtos ("Alho-Poró","Gostoso demais no preparo de quiches e saladas.",6.0,"Hortaliças"));
	Produtos.add(new Produtos ("Levedura Nutricional","Rico em vitaminas do complexo B, dá sabor de queijo.",27.0,"Temperos"));
	Produtos.add(new Produtos ("Iogurte Vegetal","O mais natural possível, plant based, sabor salada de frutas.",12.99,"Bebidas"));
	Produtos.add(new Produtos ("Leite de Aveia","Incrível para receitas e para tomar com café.",11.25,"Bebidas"));
	Produtos.add(new Produtos ("Água de Coco","Não precisa ir até a praia, leve para onde quiser.",4.50,"Bebidas"));
	Lista = Produtos;
	}
	
	@Override
	public void mostrarProdutos() {
		
		for(Produtos i: Lista) {
			i.mostrarDetalhes();
		}
		
		
	}
	
	@Override
	public void listarProdutos() {
		System.out.println("Selecione o produto que deseja comprar");
		System.out.println("\nPRODUTOS");
		System.out.println("1\tCOUVE KALE" + " Preço: R$ 4,50");
		System.out.println("2\tALHO PORÓ" + " Preço: R$ 6,00");
		System.out.println("3\tCÚRCUMA (100g)" + " Preço: R$ 8,00");
		System.out.println("4\tLEVEDURA NUTRICIONAL (100g)" + " Preço: R$ 27,00");
		System.out.println("5\tIOGURTE VEGETAL 600ml" + " Preço: R$ 12,99");
		System.out.println("6\tLEITE DE AVEIA 1L" + " Preço: R$ 11,25");
		System.out.println("7\tÁGUA DE COCO 300ml" + " Preço: R$ 4,50");
	}
	
	@Override
	public void sobreNos() {
		
		System.out.println("\nSOBRE NÓS: ");
		System.out.println("\nA Coma Vegetais existe com o propósito de ");
		System.out.println("ser uma facilitadora para quem quer receber produtos ");
		System.out.println("sem origem animal e frescos em casa. Trabalhamos ");
		System.out.println("com os melhores fornecedores afim de garantir ");
		System.out.println("qualidade e os melhores preços para você. ");	
		
	}
	
	

}
