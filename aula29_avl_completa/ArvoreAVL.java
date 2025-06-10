package aula29_avl_completa;



public class ArvoreAVL {
    private class Nodo {
        int chave;
        Nodo esquerda;
        Nodo direita;
        Nodo pai;

        public Nodo(int chave) {
            this.chave = chave;
            this.esquerda = null;
            this.direita = null;
            this.pai = null;
        }
    }
    private Nodo raiz;
    public ArvoreAVL() {
        this.raiz = null;
    }

    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if(raiz==null) {
            raiz = n;
            return;
        }
        adicionarRecursivo(n, raiz);
        verificarBalanceamento(n);

    }
    private void adicionarRecursivo(Nodo n, Nodo pai) {
        if(n.chave<=pai.chave) {
            if(pai.esquerda==null) {
                pai.esquerda = n;
                n.pai = pai;
            }
            else {
                adicionarRecursivo(n, pai.esquerda);
            }
        }
        else {
            if(pai.direita==null) {
                pai.direita = n;
                n.pai = pai;
            }
            else adicionarRecursivo(n, pai.direita);
        }
    }

    public void imprimirArvore() {
        imprimirArvoreRecursivo(raiz, 0);
    }
    private void imprimirArvoreRecursivo(Nodo n, int nivel) {
        if (n != null) {
            imprimirArvoreRecursivo(n.direita, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println(n.chave + "(" + obterFatorBalanceamento(n) + ")");
            imprimirArvoreRecursivo(n.esquerda, nivel + 1);
        }
    }

    public int obterAltura() {
        return obterAlturaRecursivo(raiz);
    }
    private int obterAlturaRecursivo(Nodo n) {
        if (n == null) {
            return -1;
        }
        int alturaEsquerda = obterAlturaRecursivo(n.esquerda);
        int alturaDireita = obterAlturaRecursivo(n.direita);
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
    private int obterFatorBalanceamento(Nodo n) {
        if(n.esquerda==null && n.direita==null) return 0;
        if(n.esquerda!=null && n.direita==null) return obterAlturaRecursivo(n.esquerda) + 1;
        if(n.esquerda==null && n.direita!=null) return obterAlturaRecursivo(n.direita) + 1;

        int alturaEsquerda = obterAlturaRecursivo(n.esquerda);
        int alturaDireita = obterAlturaRecursivo(n.direita);
        return (alturaEsquerda - alturaDireita) ;
    }

    private void verificarBalanceamento(Nodo n) {
        while (n != null) {
            int balanceamento = obterFatorBalanceamento(n);
            if (balanceamento > 1) {
                if (obterFatorBalanceamento(n.esquerda) < 0) {
                    //rotacaoEsquerda(n.esquerda);
                }
                //rotacaoDireita(n);
            } else if (balanceamento < -1) {
                if (obterFatorBalanceamento(n.direita) > 0) {
                    //rotacaoDireita(n.direita);
                }
                //rotacaoEsquerda(n);
            }
            n = n.pai;
        }
    }
}
