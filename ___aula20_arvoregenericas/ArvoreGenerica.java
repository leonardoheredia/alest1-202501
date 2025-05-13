package ___aula20_arvoregenericas;

public class ArvoreGenerica {
    public NodoArvoreGenerica raiz;
    public ArvoreGenerica(String raiz) {
        NodoArvoreGenerica n = new NodoArvoreGenerica(raiz);
        this.raiz = n;
    }
    public NodoArvoreGenerica obterNodo(String valor) {
        return obterNodoRecursivo(valor, raiz);
    }
    private NodoArvoreGenerica obterNodoRecursivo(String valor, NodoArvoreGenerica n) {
        if (n == null) return null;
        if (n.valor.equals(valor)) return n;

        NodoArvoreGenerica filho = n.primeiroFilho;
        while (filho != null) {
            NodoArvoreGenerica resultado = obterNodoRecursivo(valor, filho);
            if (resultado != null) {
                return resultado;
            }
            filho = filho.proximoIrmao;
        }
        return null;

    }
}
