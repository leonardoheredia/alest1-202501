package aula21_arvoresgenericas2;

public class ArvoreGenerica {
    private class Nodo {
        private int CAPACIDADE = 5;
        private String valor;
        private Nodo[] filhos;
        private Nodo pai;
        private int numFilhos;
        public Nodo(String valor) {
            this.valor = valor;
            filhos = new Nodo[CAPACIDADE];
        }
        public void adicionarFilho(Nodo filho) {
            filho.pai = this;
            filhos[numFilhos] = filho;
            numFilhos++;
        }
        public void imprimirFilhos() {
            System.out.println();
            for (int i = 0; i < numFilhos; i++) {
                System.out.print(filhos[i].valor + " ");
            }
            System.out.println();
        }
    }
    private Nodo raiz;
    private int tamanho;

    public void adicionarRaiz(String valor) {
        if(raiz!=null) return;
        Nodo n = new Nodo(valor);
        raiz = n;
        tamanho++;
    }

    public ArvoreGenerica(String valor) {
        adicionarRaiz(valor);
    }

    public void adicionarFilho(String pai, String valor) {
        Nodo nodoPai = obterNodo(pai);
        if(nodoPai==null) return;

        Nodo nodoFilho = new Nodo(valor);
        nodoPai.adicionarFilho(nodoFilho);
        tamanho++;
    }

    public void imprimirFilhos(String pai) {
        Nodo nodoPai = obterNodo(pai);
        if(nodoPai==null) System.out.println("NAO TEM FILHOS");
        nodoPai.imprimirFilhos();
    }

    private Nodo obterNodo(String chave) {
        return obterNodoRecursivo(raiz, chave);
    }
    private Nodo obterNodoRecursivo(Nodo n, String chave) {
        if(n.valor.equals(chave)) return n;
        for (int i = 0; i < n.numFilhos; i++) {
            Nodo encontrado = obterNodoRecursivo(n.filhos[i], chave);
            if(encontrado!=null) return encontrado;
        }
        return null;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void limpar() {
        raiz = null;
        tamanho = 0;
    }

    public String obterPai(String chave) {
        Nodo n = obterNodo(chave);
        if(n==null) return null;
        return n.pai.valor;
    }

    public void imprimirArvoreCompleta() {
        //IMPRIMIR
        //IMPLEMENTAR
    }
}
