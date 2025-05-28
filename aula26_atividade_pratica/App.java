package aula26_atividade_pratica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String[] frutas = new String[200];
        carregarArquivo("c:\\temp\\frutas.txt", frutas);
        for (int i = 0; i < frutas.length; i++) {
            if(frutas[i]!=null) System.out.println(frutas[i]);
        }
    }

    private static void carregarArquivo(String fileName, String[] frutas) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null && index < frutas.length) {
                frutas[index++] = line;
            }
            System.out.println("Arquivo carregado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
