package aula20_arvoregenericas;

public class NodoArvoreGenerica {
    public String valor;
    public NodoArvoreGenerica pai;
    public NodoArvoreGenerica primeiroFilho;
    public NodoArvoreGenerica proximoIrmao;
    public NodoArvoreGenerica(String valor) {
        this.valor = valor;
    }
    public void adicionarFilho(NodoArvoreGenerica filho) {
        if(primeiroFilho==null) primeiroFilho = filho;
        else {
            NodoArvoreGenerica aux = primeiroFilho;
            while(aux.proximoIrmao!=null) {
                aux = aux.proximoIrmao;
            }
            aux.proximoIrmao = filho;
        }
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

    public static void main(String[] args) {
        NodoArvoreGenerica raiz = new NodoArvoreGenerica("A");
        raiz.adicionarFilho(new NodoArvoreGenerica("B"));
        raiz.adicionarFilho(new NodoArvoreGenerica("C"));
        raiz.imprimir("");
    }
}
