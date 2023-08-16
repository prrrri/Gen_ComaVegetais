package menu;

import java.util.Scanner;
import java.text.NumberFormat;
import produtos.model.Produtos;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		// criação da variável tipo int, chamada opção, que receberá o nº da opção do Menu
		int opcao;
		int pedido = 0, quantidade;
		float preco = 0;
		
		//iniciada o loop while, responsável por gerar o Menu e repeti-lo na tela
		//a condição é true para que o loop seja infinito; será finalizado apenas se a opção 9 for digitada
		while (true) {
		
			//parte visual do Menu
			System.out.println("\n_______________________________________");
			System.out.println("\n\n            COMA VEGETAIS            ");
			System.out.println("\n_______________________________________");
			System.out.println("\n           1.PRODUTOS            ");
			System.out.println("\n           2.FAZER PEDIDO       ");
			//System.out.println("\n           3.ia criar conta         ");
			System.out.println("\n           3.SOBRE              ");
			System.out.println("\n           4.SAIR                ");
			System.out.println("\n_______________________________________");
			System.out.println("\nDigite a opção desejada:         ");
			System.out.println("\n                                 ");
			
			//através do objeto leia, utilizamos o método nextInt() p/ ler um nº inteiro e armazenar na variável opção
			opcao = leia.nextInt();
			
			//se a opção digitada for diferente de 4 (sair):
			if (opcao == 4) {
				System.out.println("\nVolte Sempre!");
			//objeto será finalizado
				leia.close();
			//programa será finalizado
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nPRODUTOS: ");
				
				//Instanciando produtos da classe Produtos
				Produtos produto1 = new Produtos ("Couve Kale","Prepare na air-fryer com azeite, páprica e sal. Parece um salgadinho.",4.50,"Hortaliças",7);
				Produtos produto2 = new Produtos ("Cúrcuma","O mais poderosos antiinflamatório natural",8.0,"Temperos",30);
				Produtos produto3 = new Produtos ("Alho-Poró","Gostoso demais no preparo de quiches e saladas.",6.0,"Hortaliças",4);
				Produtos produto4 = new Produtos ("Levedura Nutricional","Rico em vitaminas do complexo B, dá sabor de queijo.",27.0,"Temperos",3);
				Produtos produto5 = new Produtos ("Iogurte Vegetal","O mais natural possível, plant based, sabor salada de frutas.",12.99,"Bebidas",6);
				Produtos produto6 = new Produtos ("Leite de Aveia","Incrível para receitas e para tomar com café.",11.25,"Bebidas",15);
				Produtos produto7 = new Produtos ("Água de Coco","Não precisa ir até a praia, leve para onde quiser.",4.50,"Bebidas",15);
				
				//Chamar o método visualizar para mostrar os detalhes dos produtos
				produto1.mostrarDetalhes();
				produto2.mostrarDetalhes();
				produto3.mostrarDetalhes();
				produto4.mostrarDetalhes();
				produto5.mostrarDetalhes();
				produto6.mostrarDetalhes();
				produto7.mostrarDetalhes();
			//}
				break;
				
				/* Testar a disponibilidade e adicionar produtos ao carrinho
				if(produto1.verificarDisponibilidade()) {
					produto1.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto2.verificarDisponibilidade()) {
					produto2.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto3.verificarDisponibilidade()) {
					produto3.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto4.verificarDisponibilidade()) {
					produto4.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto5.verificarDisponibilidade()) {
					produto5.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto6.verificarDisponibilidade()) {
					produto6.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				
				if(produto7.verificarDisponibilidade()) {
					produto7.adicionarAoCarrinhO();
				}else {
					System.out.println("\nProduto indisponível para compra.");
				}
				break;
			*/
				
			case 2: {
				System.out.println("Selecione o produto que deseja comprar");
				System.out.println("\nPRODUTOS");
				System.out.println("1\tCOUVE KALE" + " Preço: R$ 4,50");
				System.out.println("2\tALHO PORÓ" + " Preço: R$ 6,00");
				System.out.println("3\tCÚRCUMA (100g)" + " Preço: R$ 8,00");
				System.out.println("4\tLEVEDURA NUTRICIONAL (100g)" + " Preço: R$ 27,00");
				System.out.println("5\tIOGURTE VEGETAL 600ml" + " Preço: R$ 12,99");
				System.out.println("6\tLEITE DE AVEIA 1L" + " Preço: R$ 11,25");
				System.out.println("7\tÁGUA DE COCO 300ml" + " Preço: R$ 4,50");

				System.out.println("\nDigite o Código do Produto: ");
				pedido = leia.nextInt();
				System.out.println("\nQuantas Unidades Você Deseja?: ");
				quantidade = leia.nextInt();
				
				switch (pedido) {

				case 1:
					preco += quantidade * 4.5f;
					System.out.println("\nPedido: COUVE KALE - Valor: " + nfMoeda.format(preco));
					break;
				case 2:
					preco += quantidade * 6.0f;
					System.out.println("\nPedido: ALHO PORÓ - Valor: " + nfMoeda.format(preco));
					break;
				case 3:
					preco += quantidade * 8.0f;
					System.out.println("\nPedido: CÚRCUMA - Valor: " + nfMoeda.format(preco));
					break;
				case 4:
					preco += quantidade * 27.0f;
					System.out.println("\nPedido: LEVEDURA NUTRICIONAL - Valor: " + nfMoeda.format(preco));
					break;
				case 5:
					preco += quantidade * 12.99f;
					System.out.println("\nPedido: IOGURTE VEGETAL - Valor: " + nfMoeda.format(preco));
					break;
				case 6:
					preco += quantidade * 11.25f;
					System.out.println("\nPedido: LEITE DE AVEIA - Valor: " + nfMoeda.format(preco));
					break;
				case 7:
					preco += quantidade * 4.5f;
					System.out.println("\nPedido: ÁGUA DE COCO: Valor: " + nfMoeda.format(preco));
				}
			}
					break;
					
			
			case 3: {
				System.out.println("\nSOBRE NÓS: ");
				System.out.println("\nA Coma Vegetais existe com o propósito de ");
				System.out.println("ser uma facilitadora para quem quer receber produtos ");
				System.out.println("sem origem animal e frescos em casa. Trabalhamos ");
				System.out.println("com os melhores fornecedores afim de garantir ");
				System.out.println("qualidade e os melhores preços para você. ");
			}
				break;
			

			default:
				System.out.println("\nOpção Inválida!");
				break;
		
	}

}
}
}