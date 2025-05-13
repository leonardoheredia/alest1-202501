package ___aula20_arvoregenericas;

public class NodoArvoreGenerica {
    public String valor;
    public NodoArvoreGenerica pai;
    public NodoArvoreGenerica primeiroFilho;
    public NodoArvoreGenerica proximoIrmao;
    public NodoArvoreGenerica(String valor) {
        this.valor = valor;
    }
    public void adicionarFilho(String valor) {
        NodoArvoreGenerica n = new NodoArvoreGenerica(valor);
        if(primeiroFilho==null) primeiroFilho = n;
        else {
            NodoArvoreGenerica aux = primeiroFilho;
            while(aux.proximoIrmao!=null) {
                aux = aux.proximoIrmao;
            }
            aux.proximoIrmao = n;
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
}
