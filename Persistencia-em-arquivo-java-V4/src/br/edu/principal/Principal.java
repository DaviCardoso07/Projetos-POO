/**
 * Introdução à Persistência em Arquivo
 * Estruturando o arquivo
 * 1. Usando várias strings
 */
package br.edu.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {

        String nome = "Fulano";
        String celular = "85999999999";
        String email = "fulano@email.com";
        
        try {
            //FileWriter fr = new FileWriter("contatos.txt");
            //fr.write(nome + ";" + celular + ";" + email + "\n");
            //fr.close();
            
            PrintWriter pw = new PrintWriter(new FileWriter("contatos.txt", true));
            
            pw.println(nome + ";" + celular + ";" + email);
            
            pw.close();

            System.out.println("Contato gravado com sucesso!");
            
            
        } catch (IOException ex) {
            System.out.println("Erro ao escrever no arquivo!");
        }
    }
}