package aula24_arvore_binaria_pesquisa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(50);
        abp.adicionar(30);
        abp.adicionar(15);
        abp.adicionar(70);
        abp.imprimirArvore();
    }
}
