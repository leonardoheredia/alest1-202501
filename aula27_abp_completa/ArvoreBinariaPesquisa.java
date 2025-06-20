package aula27_abp_completa;

public class ArvoreBinariaPesquisa {
    private class Nodo {
        private int chave;
        private Nodo filhoEsquerda;
        private Nodo filhoDireita;
        private Nodo pai;

        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;
    private int tamanho;

    public ArvoreBinariaPesquisa() {
        tamanho = 0;
    }
    public void adicionar(int chave) {
        Nodo n = new Nodo(chave);
        if (raiz == null) {
            raiz = n;
        } else {
            adicionarRecursivamente(n, raiz);
        }
        tamanho++;
    }
    private void adicionarRecursivamente(Nodo n, Nodo pai) {
        if (n.chave <= pai.chave) {
            if (pai.filhoEsquerda == null) {
                pai.filhoEsquerda = n;
                n.pai = pai;
            } else {
                adicionarRecursivamente(n, pai.filhoEsquerda);
            }
        } else {
            if (pai.filhoDireita == null) {
                pai.filhoDireita = n;
                n.pai = pai;
            } else {
                adicionarRecursivamente(n, pai.filhoDireita);
            }
        }
    }
    public boolean contem(int chave) {
        Nodo n = obterNodoRecursivamente(chave, raiz);
        return n != null;
    }
    private Nodo obterNodoRecursivamente(int chave, Nodo n) {
        if (n == null) {
            return null;
        }
        if (chave == n.chave) {
            return n;
        } else if (chave < n.chave) {
            return obterNodoRecursivamente(chave, n.filhoEsquerda);
        } else {
            return obterNodoRecursivamente(chave, n.filhoDireita);
        }
    }

    public String caminharPreOrdem() {
        StringBuilder sb = new StringBuilder();
        caminharPreOrdemRecursivo(raiz, sb);
        return sb.toString();
    }
    private void caminharPreOrdemRecursivo(Nodo n, StringBuilder sb) {
        if (n != null) {
            sb.append(n.chave).append(" ");
            caminharPreOrdemRecursivo(n.filhoEsquerda, sb);
            caminharPreOrdemRecursivo(n.filhoDireita, sb);
        }
    }

    public String caminharPosOrdem() {
        StringBuilder sb = new StringBuilder();
        caminharPosOrdemRecursivo(raiz, sb);
        return sb.toString();
    }
    private void caminharPosOrdemRecursivo(Nodo n, StringBuilder sb) {
        if (n != null) {
            caminharPosOrdemRecursivo(n.filhoEsquerda, sb);
            caminharPosOrdemRecursivo(n.filhoDireita, sb);
            sb.append(n.chave).append(" ");
        }
    }

    public String caminharCentral() {
        StringBuilder sb = new StringBuilder();
        caminharCentralRecursivo(raiz, sb);
        return sb.toString();
    }
    private void caminharCentralRecursivo(Nodo n, StringBuilder sb) {
        if (n != null) {
            caminharCentralRecursivo(n.filhoEsquerda, sb);
            sb.append(n.chave).append(" ");
            caminharCentralRecursivo(n.filhoDireita, sb);
        }
    }

    public int obterTamanho() {
        return tamanho;
    }

    public String caminharLargura() {
        if(raiz==null) return null;
        String caminho = "";

        Fila fila = new Fila();
        Nodo n = raiz;
        fila.enfileirar(n.chave);
        while(!fila.estaVazia()) {
            int e = fila.desenfileirar();
            caminho = caminho + String.valueOf(e) + " ";
            n = obterNodoRecursivamente(e, raiz);
            if(n.filhoEsquerda!=null) fila.enfileirar(n.filhoEsquerda.chave);
            if(n.filhoDireita!=null) fila.enfileirar(n.filhoDireita.chave);
        }
        return caminho;
    }

    public int obterAltura() {
        return obterAlturaRecursivo(raiz);
    }
    private int obterAlturaRecursivo(Nodo n) {
        if (n == null) {
            return -1;
        }
        int alturaEsquerda = obterAlturaRecursivo(n.filhoEsquerda);
        int alturaDireita = obterAlturaRecursivo(n.filhoDireita);
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    public int obterNivel(int chave) {
        return obterNivelRecursivo(chave, raiz, 0);
    }
    private int obterNivelRecursivo(int chave, Nodo n, int nivel) {
        if (n == null) return -1;
        if (n.chave == chave) return nivel;
        else if (chave < n.chave) return obterNivelRecursivo(chave, n.filhoEsquerda, nivel + 1);
        else return obterNivelRecursivo(chave, n.filhoDireita, nivel + 1);
    }


    public void imprimirArvore() {
        imprimirArvoreRecursivo(raiz, 0);
    }
    private void imprimirArvoreRecursivo(Nodo n, int nivel) {
        if (n != null) {
            imprimirArvoreRecursivo(n.filhoDireita, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println(n.chave);
            imprimirArvoreRecursivo(n.filhoEsquerda, nivel + 1);
        }
    }

    public boolean remover(int chave) {
        Nodo n = obterNodoRecursivamente(chave, raiz);
        if(n==null) return false;

        if(ehFolha(n)) {
            if (n.pai.filhoEsquerda != null && n.pai.filhoEsquerda.chave == chave) n.pai.filhoEsquerda = null;
            else n.pai.filhoDireita = null;
            return false;
        }
        return false;
    }

    private boolean ehFolha(Nodo n) {
        return (n.filhoEsquerda==null & n.filhoDireita==null);
    }

    public int encontrarMinimo() {
        return encontrarMinimo(raiz);
    }

    private int encontrarMinimo(Nodo n) {
        int menor = n.chave;
        while(n.filhoEsquerda!=null) {
            n = n.filhoEsquerda;
            if(n.chave < menor) menor = n.chave;
        }
        return  menor;
    }


    public int encontrarMaximo() {
        return encontrarMaximo(raiz);
    }
    private int encontrarMaximo(Nodo n)  {
        int maior = n.chave;
        while (n.filhoDireita!=null) {
            n = n.filhoDireita;
            if(n.chave > maior) maior = n.chave;
        }
        return maior;
    }



    public int contarFolhas() {
        return -1;
        //IMPLEMENTAR
    }

    public int contarInternos() {
        return -1;
        //IMPLEMENTAR
    }

    public int somarChaves() {
        return -1;
        //IMPLEMENTAR (SOMAR TODAS AS CHAVES)
    }

    public String caminharLarguraAvancado() {
        //IMPLEMENTAR (DEVE CAMINHAR EM LARGURA MAS COLOCANDO CADA NIVEL EM UMA NOVA LINHA
        //EXEMPLO:
        //  100
        //  60 180
        //  40 200 144
        return "";
    }

}
