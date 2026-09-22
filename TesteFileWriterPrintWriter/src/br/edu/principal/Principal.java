package br.edu.principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		File file = new File("contatos.txt"); // Declara um endereço de arquivo
		
		try { // Tente fazer isso:
			FileWriter fw = new FileWriter(file); // usar o ", true" para sobrescrever
			fw.write("Turma 01 \n");
			fw.write("Turma 02 \n");
			
			fw.close(); // Fechar o arquivo é importante para funcionar
			
		} catch(IOException ex) { // Caso dê um erro:
			System.out.println("ERRO!");
		} // try/catch
	} // main
} // class
