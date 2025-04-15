package aula13_listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {
    private class Nodo {
        String item;
        Nodo anterior;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    public ListaDuplamenteEncadeada() {
        inicio = new Nodo(null);
        fim = new Nodo(null);
        inicio.proximo = fim;
        fim.anterior = inicio;
    }
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        n.proximo = fim;
        n.anterior = fim.anterior;
        fim.anterior.proximo = n;
        fim.anterior = n;
    }

    public void adicionar(int posicao, String item) {
        //IMPLEMENTAR
    }

    public int retornarQuantidade() {
        return 0;
        //implementar
    }

    public void imprimir() {
        Nodo aux = inicio.proximo;
        while (aux!=fim) {
            System.out.println(aux.item);
            aux = aux.proximo;
        }
    }

}
