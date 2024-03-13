package br.com.projetolist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		// Declarar e inicializar uma Lista
		List<String> listaNomes = new ArrayList<String>();
		
		// Descobrir o tamanho da lista
		System.out.println(listaNomes.size());
		
		// Aplicando CRUD
		
		// Create: Adicionar elementos a lista
		listaNomes.add("Harry");
		listaNomes.add("Rony");
		listaNomes.add("Hermione");
		listaNomes.add("Luna");
		
		// Read: Listar Elementos
		System.out.println("- Lista de presença:");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		// Encontrar o index de um elemento
		int indexAlterar = listaNomes.indexOf("Rony");
		int indexExcluir = listaNomes.indexOf("Luna");
		
		// Edit: Editar Elementos
		listaNomes.set(indexAlterar, "Albus");
		
		// Delete: Remover Elementos
		listaNomes.remove(indexExcluir);
		
		System.out.println("-----------");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}
