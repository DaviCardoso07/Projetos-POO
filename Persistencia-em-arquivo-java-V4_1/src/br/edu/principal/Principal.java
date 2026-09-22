/**
 * Introdução à Persistência em Arquivo
 * Estruturando o arquivo
 * 1. Usando várias strings
 * 2. Separando os dados com split(";")
 */
package br.edu.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("contatos.txt"));
            
            String linha = br.readLine();
            
            while (linha != null) {

                String[] dados = linha.split(";");

                String nome = dados[0];
                String celular = dados[1];
                String email = dados[2];

                System.out.println("--------------------");
                System.out.println("Nome: " + nome);
                System.out.println("Celular: " + celular);
                System.out.println("E-mail: " + email);
                System.out.println("--------------------");

                linha = br.readLine();
            }

            br.close();
            
            System.out.println("Contatos lidos com sucesso!");
            
            
        } catch (IOException ex) {
            System.out.println("Erro ao escrever no arquivo!");
        }
    }
}