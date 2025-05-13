package aula20_arvoresgenericas;

public class App {
    public static void main(String[] args) {
        ArvoreGenerica t = new ArvoreGenerica("A");
        t.getRaiz().adicionarFilho("B");
        t.getRaiz().adicionarFilho("Z");
        t.getRaiz().adicionarFilho("P");

        t.getNodo("B").adicionarFilho("M");
        t.getNodo("B").adicionarFilho("K");
        t.getNodo("B").adicionarFilho("L");

        t.getNodo("L").adicionarFilho("X");

        System.out.println();
        System.out.println();
        t.getRaiz().imprimir("");

        System.out.println();
        System.out.println(t.getTamanho());
        System.out.println();

        System.out.println(t.getGrau("L"));

    }
}
