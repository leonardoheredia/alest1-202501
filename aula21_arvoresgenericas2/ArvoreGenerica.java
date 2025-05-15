package aula21_arvoresgenericas2;

public class ArvoreGenerica {
    private class Nodo {
        private int CAPACIDADE = 5;
        private String valor;
        private Nodo[] filhos;
        private Nodo pai;
        private int numFilhos;
        public Nodo(String valor) {
            this.valor = valor;
            filhos = new Nodo[CAPACIDADE];
        }
        public void adicionarFilho(Nodo filho) {
            filhos[numFilhos] = filho;
            numFilhos++;
        }
        public void imprimirFilhos() {
            System.out.println();
            for (int i = 0; i < numFilhos; i++) {
                System.out.print(filhos[i] + " ");
            }
            System.out.println();
        }
    }
    private Nodo raiz;
    public ArvoreGenerica(String valor) {
        Nodo n = new Nodo(valor);
        this.raiz = n;
    }
    public void adicionarFilho(String pai, String valor) {
        //IMPLEMENTAR
    }

    public void imprimirFilhos(String pai) {
        //IMPLEMENTAR
    }

    public Nodo obterNodo(String pai) {
        //IMPLEMENTAR
        return null;
    }

}
