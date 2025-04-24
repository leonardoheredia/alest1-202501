package aula15_pilhas;

public class PilhaEstatica {
    private final int CAPACIDADE_INICIAL = 5;
    private String[] itens;
    private int topo;
    private int capacidade;
    private int tamanho;

    public PilhaEstatica() {
        capacidade = CAPACIDADE_INICIAL;
        tamanho = 0;
        topo = -1;
        itens = new String[capacidade];
    }
    public void empilhar(String item) {
        topo++;
        itens[topo] = item;
        tamanho++;
    }
    public String desempilhar() {
        String aux = itens[topo];
        itens[topo] = null;
        topo--;
        tamanho--;
        return aux;
    }

    public void imprimir() {
        for (int i = tamanho-1; i >=0; i--) {
            System.out.println(itens[i]);
        }
    }


}
