package aula20_arvoresgenericas;

public class ArvoreGenerica {
    class Nodo {
        public String valor;
        public Nodo primeiroFilho;
        public Nodo proximoIrmao;

        public Nodo(String valor) {
            this.valor = valor;
        }

        public void adicionarFilho(String valor) {
            Nodo novoFilho = new Nodo(valor);
            if (this.primeiroFilho == null) {
                primeiroFilho = novoFilho;
                tamanho++;
                return;
            }
            Nodo aux = this.primeiroFilho;
            while (aux.proximoIrmao != null) { //achar a posicao do novo irmao
                aux = aux.proximoIrmao;
            }
            aux.proximoIrmao = novoFilho;
            tamanho++;
        }

        public void imprimir(String prefixo) {
            System.out.println(prefixo + valor);

            if (primeiroFilho != null) {
                primeiroFilho.imprimir(prefixo + "--");
            }
            if (proximoIrmao != null) {
                proximoIrmao.imprimir(prefixo);
            }
        }
    }
    Nodo raiz;
    public ArvoreGenerica(String valor) {
        raiz = new Nodo(valor);
        tamanho = 1;
    }
    public Nodo getRaiz() {
        return raiz;
    }
    public Nodo getNodo(String chave) {
        return buscarNodoRecursivo(raiz, chave);

    }
    private Nodo buscarNodoRecursivo(Nodo n, String chave) {
        if(n==null) return null;
        if(n.valor.equals(chave)) return n;

        Nodo filho = n.primeiroFilho;
        while (filho!=null) {
            Nodo r = buscarNodoRecursivo(filho, chave);
            if(r != null) return r;
            filho = filho.proximoIrmao;
        }
        return null;
    }
    public void imprimirFilhos(Nodo pai) {
        Nodo aux = pai.primeiroFilho;
        System.out.println();
        while (aux!=null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximoIrmao;
        }
    }
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }
    public int getGrau(String chave) {
        //IMPLEMENTAR
        return -1;
    }
    public int getAltura() {
        //IMPLEMENTAR
        return -1;
    }
    public String getPai(String chave) {
        //IMPLEMENTAR
        return null;
    }

}
