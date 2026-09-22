/**
 * Introdução à Persistência em Arquivo
 * Escrevendo em Arquivos em Java
 * 1. Classe FileWriter();
 * 2. Classe PrintWriter();
 * 3. Sobrescrever × adicionar (append)
 * 4. Consultando informações do arquivo
 */
package br.edu.principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {
        File file = new File("contatos.txt");
        try {
            //forma básica
            //FileWriter fw = new FileWriter(file);
            //fw.write("Primeira linha\n"); // O \n pula a linha
            //fw.write("Segunda linha\n");
            //fw.close();
            
            //forma tradicional
            //FileWriter fw = new FileWriter("arquivo.txt");
            //PrintWriter pw = new PrintWriter(fw);
            
            PrintWriter pw = new PrintWriter(new FileWriter(file));

            pw.println("Roger;85999999999;roger@email.com"); // Pula linha sozinho!
            pw.println("Maria;85888888888;maria@email.com");
            pw.println("Pedro;85777777777;pedro@email.com");

            pw.close();
            

            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao escrever no arquivo!");
        }
    }
}