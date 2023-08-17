package menu;

import java.util.Scanner;
import java.text.NumberFormat;
import produtos.model.Produtos;
import menu.controller.MenuController;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		MenuController loja = new MenuController();
		
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
				
				loja.descricaoProdutos();
				
				loja.mostrarProdutos();
				
				break;
				
			case 2: {
				System.out.println("Faça seus pedidos:");

                // Inicializar variável para armazenar o valor total da compra
                float total = 0;

                loja.listarProdutos();
				
				char resposta='S';
				
				while (resposta != 'N') {
					
	
					System.out.println("\nDigite o Código do Produto: ");
				pedido = leia.nextInt();
                
				System.out.println("\nQuantas Unidades Você Deseja? ");
				quantidade = leia.nextInt();
				System.out.println("\nDeseja continuar comprando? S/N" );
				resposta = leia.next().toUpperCase().charAt(0);
				float valorItem = 0;
				
				switch (pedido) {
				
		            case 1:
		                valorItem = quantidade * 4.5f;
		                break;
		            case 2:
		                valorItem = quantidade * 6.0f;
		                break;
		            case 3:
		                valorItem = quantidade * 8.0f;
		                break;
		            case 4:
		                valorItem = quantidade * 27.0f;
		                break;
		            case 5:
		                valorItem = quantidade * 12.99f;
		                break;
		            case 6:
		                valorItem = quantidade * 11.25f;
		                break;
		            case 7:
		                valorItem = quantidade * 4.5f;
		                break;
		            default:
		                System.out.println("\nOpção Inválida!");
		                continue;  // Continua o loop sem adicionar ao total
		        }

				
		        // Adicionar o valor do item ao total da compra
		        total += valorItem;
		    }
		                
		    System.out.println("\nTotal da Compra: " + nfMoeda.format(total));
            
            }
                
		break;
			
			
			case 3: {
				loja.sobreNos();
			}
				break;
			

			default:
				System.out.println("\nOpção Inválida!");
				break;
		
	}

}
}
}