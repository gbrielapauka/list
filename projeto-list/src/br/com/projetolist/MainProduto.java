package br.com.projetolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {
	// Criar classe MainProduto, contendo uma lista de (String) de produtos.
	// Implementas o CRUD do produto com interação com o usuário atráves de um menu de opções. 
	private static ArrayList<String> listaProduto = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sair = false;
		
		while(!sair) {
			System.out.println("---- Menu ----");
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Atualizar Produto");
			System.out.println("4. Remover Produto");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opção: ");
			
			int opcao = scan.nextInt();
			scan.nextLine();
			
			switch (opcao) {
			case 1: 
				adicionarProduto();
				break;
			case 2: 
				listarProduto();
				break;
			case 3:
				atualizarProduto();
				break;
			case 4:
				removerProduto();
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
		System.out.println("Programa encerrado!");
	}
	
	// Adicionando elemento a variável produto
	// adicionando váriavel a lista
	private static void adicionarProduto() {
		System.err.println("Digite o nome do produto a ser adicionado: ");
		String produto = scan.nextLine();
		listaProduto.add(produto);
		System.out.println("Produto adicionado com sucesso!");
	}
	
	// Verificando se lista possui elementos
	// E listando os produtos caso exista
	private static void listarProduto() {
		if (listaProduto.isEmpty()) {
			System.out.println("Não há produtos na lista.");
		} else {
			System.out.println("--- Lista de Produtos ---");
			for (String produto : listaProduto) {
				System.out.println(produto);
			}
		}
	}
	
	// Verificando se existe algum produto para editar
	// Solicitando o nome do produto a ser editado ao usuário
	// Verificando se o nome digitado existe pelo indice dele
	// Solicitando o novo nome ao usuário e editando 
	private static void atualizarProduto() {
		if(listaProduto.isEmpty()) {
			System.out.println("Não há produtos para atualizar!");
			return;
		}
		
		System.out.println("Digite o nome do produto a ser atualizado: ");
		String nomeProduto = scan.nextLine();
		int indexAlterar = listaProduto.indexOf(nomeProduto);
		scan.nextLine();
		
		if (indexAlterar == -1) {
			System.out.println("Produto " + nomeProduto + " não encontrato!");
		}
		
		System.out.println("Digite o novo nome do produto: ");
		String novoProduto = scan.nextLine();
		listaProduto.set(indexAlterar, novoProduto);
		System.out.println("Produto atualizado com sucesso.");
	}
	
	public static void removerProduto() {
		if(listaProduto.isEmpty()) {
			System.out.println("Não há produtos para remover!");
			return;
		}
		
		System.out.println("Digite o nome do produto a ser removido: ");
		String nomeProduto = scan.nextLine();
		int indexExcluir = listaProduto.indexOf(nomeProduto);
		scan.nextLine();
		
		if (indexExcluir == -1) {
			System.out.println("Produto " + nomeProduto + " não encontrato!");
		}
		
		String produtoRemovido = listaProduto.remove(indexExcluir);
		System.out.println("Produto removito com sucesso: " + produtoRemovido);
	}
}
