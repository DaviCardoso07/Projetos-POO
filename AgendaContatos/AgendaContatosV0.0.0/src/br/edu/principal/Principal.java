package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String celular = "";
		String email = "";
		boolean continuar = true; // para criar o while true
		
		System.out.println("========================");
		System.out.println("   AGENDA DE CONTATOS   ");
		System.out.println("        v0.0.0          ");
		System.out.println("========================");
		
		System.out.println("Bem vindo!");
		
		while (continuar) {
		System.out.println();
		System.out.println("=========MENU=========");
		System.out.println("1 - Adicionar contato");
		System.out.println("2 - Listar contato");
		System.out.println("3 - Procurar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Sair");
		System.out.println("======================");

		System.out.println();
		
		System.out.println("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine(); // para não dar erro no "/n"
		
		switch (opcao) {
			case 1 -> {
				System.out.println("\n---ADICIONAR CONTATO---");
				
				System.out.println("Digite o nome: ");
				nome = sc.nextLine();
				
				System.out.println("Digite o celular: ");
				celular = sc.nextLine();
				
				System.out.println("Digite o email: ");
				email = sc.nextLine();
			}
			case 2 -> {
				System.out.println("Listar contato");
				System.out.println();
				System.out.println("nome: " + nome);
				System.out.println("celular: " + celular);
				System.out.println("email: " + email);
				System.out.println();
			}
			case 3 -> {
				System.out.println("Procurar contato");
			}
			case 4 -> {
				System.out.println("Excluir contato");
			}
			case 5 -> {
				System.out.println("Saindo...");
				continuar = false; // para sair do while true
			}
			default -> { // quando tem só uma linha não preciso das chaves("{}"), usei aqui s´pra deixar masi organizado
				System.out.println("Opção inválida");
			}
		}//switch
		
	}//while
		
		


	}

}
