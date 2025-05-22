package aula24_arvore_binaria_pesquisa;

public class ArvoreBinariaPesquisa {
    private class Nodo {
        private int chave;
        private Nodo filhoEsquerda;
        private Nodo filhoDireita;
        private Nodo pai;
        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;
    private int tamanho;

    public ArvoreBinariaPesquisa() {

    }

    public void inserir(int chave) {
        Nodo n = new Nodo(chave);

    }
}
