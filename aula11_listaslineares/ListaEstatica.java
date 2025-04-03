package aula11_listaslineares;

public class ListaEstatica {
    private final int CAPACIDADE_INCIAL = 10;
    private String[] itens;
    private int tamanho;

    public ListaEstatica() {
        itens = new String[CAPACIDADE_INCIAL];
        tamanho = 0;
    }

    public boolean remover(String item) {
        int p = obterPosicao(item);
        if(p<0) return false;

        for (int i = p; i < tamanho - 1; i++) {
            itens[i] = itens[i+1];
        }
        itens[tamanho-1] = null;
        tamanho--;
        return true;
    }

    public int obterPosicao(String item) {
        for (int i = 0; i < tamanho; i++) {
            if(itens[i].equals(item)) return i;
        }
        return -1;
    }


    public boolean estaVazia() {
        return tamanho==0;
    }

    public void limpar() {
        itens = new String[CAPACIDADE_INCIAL];
        tamanho=0;
    }

    public boolean contem(String chave) {
        for (int i = 0; i < tamanho; i++) {
            if(itens[i].equals(chave)) return true;
        }
        return false;
    }

    public void adicionar(String item) {
        itens[tamanho] = item;
        tamanho++;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s = s + itens[i] + " ";
        }
        return s;
    }
}
