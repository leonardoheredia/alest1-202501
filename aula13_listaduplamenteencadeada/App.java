package aula13_listaduplamenteencadeada;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        l.adicionar("Cecilia");
        l.adicionar("Lucas");
        l.adicionar(1, "Marilia");
        l.adicionar(0, "Andreas");
        l.imprimir();
    }
}
