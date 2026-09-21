package br.edu.principal;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File ("contatos.txt"); //representa o caminho do arquivo(relativo e o absoluto)
		System.out.println("Arquivo definido");
		
		//verifica arquivo
		if(arquivo.exists()) {
			System.out.println("O arquivo existe!");
		}
		// se não existir ele cria um novo
		else {
			try	{ // try = tente fazer isso
				arquivo.createNewFile(); // ele cria o arquivo
				System.out.println("Arquivo foi criado!");
			} catch (IOException e) { // catch = capturar ; se der errado ele catch essa execeção e guarde na variável "e"
				System.out.println("Erro ao criar o arquivo");
			}	
		}//else
		
		System.out.println("");
		System.out.println("=== INFORMAÇÕES DO ARQUIVO ===");
		System.out.println("");
		
		System.out.println("Nome: " + arquivo.getName());
		System.out.println("Caminho: " + arquivo.getPath());
		System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
		System.out.println("Tamanho: " + arquivo.length() + " bytes");
		System.out.println("Pode ler: " + arquivo.canRead());
		System.out.println("Pode escrever: " + arquivo.canWrite());
		System.out.println("É arquivo: " + arquivo.isFile());
		System.out.println("É diretório: " + arquivo.isDirectory());

	}

}
