/**
 * Introdução à Persistência em Arquivo
 * Lendo Arquivos em Java
 * 1. Classe FileReader();
 * 2. Classe BufferedReader();
 * 3. Lendo todo o arquivo com loop
 * 4. Consultando informações do arquivo
 */
package br.edu.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args){

        File file = new File("contatos.txt");
        
        try{
            //FileReader fr = new FileReader("contatos.txt");
            //BufferedReader br = new BufferedReader(fr);
            
            BufferedReader br = new BufferedReader(new FileReader("contatos.txt"));
            
            //String linha = br.readLine();
            //System.out.println(linha);
            
            //System.out.println(br.readLine());
            //System.out.println(br.readLine());
            
            String linha = br.readLine();

            while (linha != null) {

                System.out.println(linha);

                linha = br.readLine();
            }

            br.close();
            
            System.out.println("Dados lidos com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao escrever no arquivo!");
        } 
    }
}