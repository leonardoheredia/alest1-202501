package ___aula05_filadeprioridade_heap;

public class HeapMax {
    private int[] chaves;
    private int capacidade = 10;
    private int tamanho;

    public HeapMax() {
        tamanho = 0;
        chaves = new int[capacidade];
    }
    public void inserir(int chave) {
        chaves[tamanho] = chave;
        swim(tamanho);
        tamanho++;

    }
    private void swim(int posicao) {
        if(posicao==0) return;
        if(chaves[posicao] > chaves[(posicao-1)/2]) {
            int temp = chaves[(posicao-1)/2];
            chaves[(posicao-1)/2] = chaves[posicao];
            chaves[posicao] = temp;
            swim((posicao-1)/2);
        }
    }
    private void heapify(int posicao) {
        int pMaior = posicao;
        int pEsq = 2*posicao+1;
        int pDir = 2*posicao+2;
        if(pEsq<tamanho && chaves[pEsq]>chaves[pMaior]) pMaior = pEsq;
        if(pDir<tamanho && chaves[pDir]>chaves[pMaior]) pMaior = pDir;

        if(pMaior!=posicao) {
            int temp = chaves[posicao];
            chaves[posicao] = chaves[pMaior];
            chaves[pMaior] = temp;

            heapify(pMaior);
        }
    }
    public void removerMaximo() {
        if(tamanho==0) return;
        //trocar primeiro pelo ultimo
        int temp = chaves[0];
        chaves[0] = chaves[tamanho-1];
        chaves[tamanho-1] = temp;

        tamanho--;
        heapify(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(chaves[i]).append(" ");
        }
        return sb.toString();
    }


}
