package aula11_listaslineares;

public class ListaEstatica {
    private final int CAPACIDADE_INCIAL = 10;
    private String[] itens;
    private int tamanho;

    public ListaEstatica() {
        itens = new String[CAPACIDADE_INCIAL];
        tamanho = 0;
    }

    public boolean estaVazia() {
        return false;//IMPLEMENTAR
    }

    public void limpar() {
        //limpaa lista
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
