/**
 * Introdução à Persistência em Arquivo
 * Tratamento básico de erros
 * 1. Arquivo inexistente
 * 2. Arquivo vazio
 * 3. Linha incompleta
 * 4. Informando registros inválidos
 */
package br.edu.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        
        File file = new File("contatos.txt");

        if (!file.exists()) {

            System.out.println("O arquivo não existe!");
            return;
        }

        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String linha = br.readLine();
            
            if (linha == null) {
                System.out.println("O arquivo está vazio!");
            }
            
            while (linha != null) {

                String[] dados = linha.split(";");
                
                if (dados.length == 3) {

                    String nome = dados[0];
                    String celular = dados[1];
                    String email = dados[2];

                    System.out.println("--------------------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Celular: " + celular);
                    System.out.println("E-mail: " + email);
                    System.out.println("--------------------");
                }
                else{
                    System.out.println("Registro inválido: " + linha);
                }

                linha = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
            System.out.println("Motivo: " + e.getMessage());
        }
    }
}