/**
 * Introdução à Persistência em Arquivo
 * Arquivos em Java
 * 1. Classe File();
 * 2. Verificando se um arquivo existe;
 * 3. Criando fisicamente o arquivo
 * 4. Consultando informações do arquivo
 */
package br.edu.principal;

import java.io.File;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) {
        File arquivo = new File("contatos.txt"); //Representa o caminho para o arquivo.
        System.out.println("Arquivo definido!"); //new File() não cria o arquivo.
        
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            System.out.println("Erro ao criar o Arquivo!");
        }
        
        if(arquivo.exists()){
            System.out.println("Arquivo Existe!! \n");
        }else{
            System.out.println("Arquivo NÃO Existe! \n");
        }

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
