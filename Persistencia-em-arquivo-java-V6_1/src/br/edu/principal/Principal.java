/**
 * Introdução à Persistência em Arquivo
 * Modularizando as operações de arquivo 2.0
 */
package br.edu.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        
        escreverArquivo();

        lerArquivo();
        
    }
    
    public static void escreverArquivo() {

        try (FileWriter fw = new FileWriter("contatos.txt")){

            fw.write("Roger;85999999999;roger@email.com\n");
            fw.write("Maria;85888888888;maria@email.com\n");
            fw.write("Pedro;85777777777;pedro@email.com\n");

            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao escrever no arquivo!");
            System.out.println("Motivo: " + e.getMessage());
        }
    }
    
    public static void lerArquivo() {

        try (BufferedReader br = new BufferedReader(new FileReader("contatos.txt"))){

            String linha = br.readLine();

            if (linha == null) {
                System.out.println("O arquivo está vazio!");
            }

            while (linha != null) {

                String[] dados = linha.split(";");

                if (dados.length == 3) {

                    System.out.println("--------------------");
                    System.out.println("Nome: " + dados[0]);
                    System.out.println("Celular: " + dados[1]);
                    System.out.println("E-mail: " + dados[2]);

                } else {

                    System.out.println("Registro inválido: " + linha);
                }

                linha = br.readLine();
            }
        } catch (IOException e) {

            System.out.println("Erro ao ler o arquivo!");
            System.out.println("Motivo: " + e.getMessage());
        }
    }
}