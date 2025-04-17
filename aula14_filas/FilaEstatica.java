package aula14_filas;

public class FilaEstatica {
    private String[] itens;
    private int capacidade = 7;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaEstatica() {
        itens = new String[capacidade];
        inicio = 0;
        tamanho = 0;
        fim = -1;
    }
    public int getTamanho() {
        return tamanho;
    }

    public void enfileirar(String item) {
       if(tamanho+1<capacidade) {
           fim++;
           itens[fim] = item;
           tamanho++;
       }
       else { //aumentar
           String[] novoItens = new String[capacidade*2];
           int pos = 0;
           for (int i = inicio; i <= fim; i++) {
               novoItens[pos] = itens[i];
               pos++;
           }
           fim = pos;
           inicio = 0;
           this.itens = novoItens;
           tamanho++;
       }
    }
    public String desenfileirar() {
        String retorno = itens[inicio];
        itens[inicio] = null;
        inicio++;
        tamanho--;
        return retorno;
    }
    public void imprimir() {
        System.out.println();
        for (int i = inicio; i <= fim; i++) {
            System.out.print(itens[i] + " ");
        }
        System.out.println();
    }




}
