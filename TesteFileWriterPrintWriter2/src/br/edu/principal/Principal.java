package br.edu.principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		
		File file = new File("contatos.txt");
		String nome = "fulano";
		String celular = "859999999";
		String email = "fulano@gmail.com";
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("contatos.txt"));
			pw.println(nome + ";" + celular + ";" + email);
			pw.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo!");
		}
	}
} // class

//O IDEAL SERIA FAZER UM SCANNER, MAS POR FALTA DE TEMPO ELE DECIDIU USAR SÓ AS STRINGS MSM
