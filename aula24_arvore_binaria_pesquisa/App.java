package aula24_arvore_binaria_pesquisa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(30);
        abp.adicionar(20);
        abp.adicionar(50);
        abp.adicionar(10);
        abp.adicionar(25);
        abp.adicionar(70);

        abp.imprimirArvore();

        System.out.println();
        System.out.println("Tamanho = " + abp.getTamanho());

        System.out.println(abp.existe(10));
        System.out.println(abp.existe(50));
        System.out.println(abp.existe(100));
    }
}
