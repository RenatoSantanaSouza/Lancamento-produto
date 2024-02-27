import java.util.Scanner;

public class Lancamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//obtém a quantidade de produtos que o usuario deseja informar
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = entrada.nextInt();
		
		//Precisamos informar essa linha extra para garantir que uma nova linha seja lida,
		//pois nextInt não l~e uma nova linha, mas apenas um número.
		entrada.nextLine();
		
		// Instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();
		estoque.produtos = new Produtos[quantidadeProdutos];
		
		for (int i = 0; i < estoque.produtos.length; i ++) {
			estoque.produtos[i] = new Produtos();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------");
			System.out.println("Descrição: ");
			
			estoque.produtos[i].setDescricao(entrada.nextLine());
			
			System.out.println("Quantidade de itens: ");
			
			estoque.produtos[i].setQuantidade(entrada.nextInt());
			entrada.nextLine();
		}
		
		int sum = 0;
		for (int i = 0; i< estoque.produtos.length; i++) {
			sum = estoque.produtos[i].getQuantidade() + sum;
		}
		
		estoque.listarProdutos();
		
		System.out.println("Consta um total de " + sum + " SKU's");
		entrada.close();
		
	}

}
