package aula12_listasimplesmenteencadeada;

public class ListaSimplesmenteEncadeada {
    private class Nodo {
        public String item;
        public Nodo proximo;
        public Nodo(String item) {
            this.item = item;
            this.proximo = null;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        if(inicio==null) { //lista esta vazia
            inicio = n;
            fim = n;
        }
        else { //adicionar no final da lista
            fim.proximo = n;
            fim = n;
        }
    }
    public void imprimir() {
        //imprime todos elementos da lista

    }


}
