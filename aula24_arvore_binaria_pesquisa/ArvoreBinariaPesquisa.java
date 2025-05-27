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

    public ArvoreBinariaPesquisa() {

    }
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(raiz==null)  raiz = n;
        else adicionarRecursivamente(n, raiz);
    }

    private void adicionarRecursivamente(Nodo n, Nodo pai) {
        if(n.chave <= pai.chave) {
            if(pai.filhoEsquerda==null) pai.filhoEsquerda = n;
            else adicionarRecursivamente(n, pai.filhoEsquerda);
        }
        else {
            if(pai.filhoDireita==null) pai.filhoDireita = n;
            else adicionarRecursivamente(n, pai.filhoDireita);
        }
    }

    public int getTamanho() {
        //IMPLEMENTAR
        return -1;
    }
    public boolean estaVazio() {
        //IMPLEMENTAR
        return false;
    }
    public boolean existe(int chave) {
        //RETORNA TRUE SE A CHAVE EXISTE NA ARVORE OU FALSE SE NAO EXISTE
        //IMPLEMENTAR
        return false;
    }

    public void caminharPreOrdem() {
        //IMPIMIR O CAMINHO EM PRE ORDEM
        //IMPLEMENTAR
    }
    public void caminharPosOrdem() {
        //IMPRIMIR O CAMINHO EM POS ORDEM
        //IMPLEMENTAR
    }















    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(Nodo raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.filhoDireita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.chave + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.filhoEsquerda, nivel);
    }
}
