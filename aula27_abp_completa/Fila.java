package aula27_abp_completa;

public class Fila {
    private class Nodo {
        private int chave;
        private Nodo proximo;

        public Nodo(int chave) {
            this.chave = chave;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public Fila() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void enfileirar(int chave) {
        Nodo n = new Nodo(chave);
        if (fim != null) {
            fim.proximo = n;
        }
        fim = n;
        if (inicio == null) {
            inicio = n;
        }
        tamanho++;
    }

    public Integer desenfileirar() {
        if (inicio == null) {
            return null; // Fila vazia
        }
        int chave = inicio.chave;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null; // Se a fila ficou vazia
        }
        tamanho--;
        return chave;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }


}
