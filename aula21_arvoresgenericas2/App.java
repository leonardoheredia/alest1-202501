package aula21_arvoresgenericas2;

public class App {
    public static void main(String[] args) {
        ArvoreGenerica t = new ArvoreGenerica("A");
        t.adicionarFilho("A", "B");
        t.adicionarFilho("A", "C");
        t.adicionarFilho("A", "D");
        t.adicionarFilho("B", "X");
        t.adicionarFilho("B", "Y");
        t.adicionarFilho("D", "Z");
        t.adicionarFilho("D", "P");
        t.adicionarFilho("D", "R");
        t.imprimirFilhos("A");
        t.imprimirFilhos("D");

        System.out.println(t.obterPai("C"));

    }
}
