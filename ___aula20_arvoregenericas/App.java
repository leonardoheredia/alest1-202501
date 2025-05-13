package ___aula20_arvoregenericas;

public class App {

    public static void main(String[] args) {
        ArvoreGenerica t = new ArvoreGenerica("A");
        t.raiz.adicionarFilho("C");
        t.obterNodo("C").adicionarFilho("D");
        t.raiz.imprimir("");

    }

}
