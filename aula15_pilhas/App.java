package aula15_pilhas;

public class App {
    public static void main(String[] args) {
        PilhaEstatica p = new PilhaEstatica();
        p.empilhar("pera");
        p.empilhar("laranja");
        p.empilhar("abacaxi");
        p.imprimir();
        System.out.println();
        p.desempilhar();
        p.desempilhar();
        p.desempilhar();
        p.desempilhar();
        p.imprimir();
    }
}
