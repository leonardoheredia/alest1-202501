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
        tamanho = 0;
    }
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(raiz==null)  raiz = n;
        else adicionarRecursivamente(n, raiz);
        tamanho++;
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
        return tamanho;
    }
    public boolean estaVazio() {
        return (raiz==null);
    }
    public boolean existe(int chave) {
        boolean achou = false;
        Nodo aux = raiz;
        while(!achou) {
            if(chave==aux.chave) achou = true;
            else {
                if(chave<aux.chave) aux = aux.filhoEsquerda;
                else aux = aux.filhoDireita;
            }
        }
        return achou;
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
