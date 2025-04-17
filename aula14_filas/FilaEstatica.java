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
        //IMPLEMENTAR O DUPLICAR
        //VERIFICAR SE O TAMANHO SERA MAIOR QUE A CAPACIDADE
        fim++;
        itens[fim] = item;
        tamanho++;
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
