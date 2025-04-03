package aula06_pesquisaarrays;

import utils.ArrayUtils;

public class Exercicios {
    public static int[] mergear(int[] a, int b[]) {
        int[] m = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            m[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            m[a.length+i] = b[i];
        }
        return m;
    }
    public static int[] mergearOrdenado(int[] a, int[] b) {
        int[] m = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < m.length) {
            ArrayUtils.imprimir(m);
            if(i>=a.length && j<b.length) { //verifica se o vetor A ja foi todo percorrido
                m[k] = b[j];
                j++;
                k++;
            }
            else if(j>=b.length && i<a.length) { //verifica se o vetor B ja foi todo percorrido
                m[k] = a[i];
                i++;
                k++;
            }
            else if(a[i] < b[j]) { //compara os dois, so entra nessa condicao se A e B tem valores a percorrer
                m[k] = a[i];
                i++;
                k++;
            }
            else { //senao esta no vetor A entao esta no vetor B
                m[k] = b[j];
                j++;
                k++;
            }
        }
        return m;
    }

    public static boolean buscaBinaria(int[] a, int chave, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        System.out.println(inicio + " " + meio + " " + fim);
        if(inicio>fim) return false;
        if(chave==a[meio]) return true;
        else if(chave>a[meio]){
            inicio = meio + 1;
            return buscaBinaria(a, chave, inicio, fim);
        }
        else {
            fim = meio - 1;
            return buscaBinaria(a, chave, inicio, fim);
        }
    }
    public static void main(String[] args) {
        int[] a = {10, 14, 20, 90, 100, 110};
        int[] b = {12, 15, 32, 50, 65};

        int[] m = mergearOrdenado(a, b);
        ArrayUtils.imprimir(m);

        System.out.println(buscaBinaria(a, 10, 0, a.length-1));
        System.out.println(buscaBinaria(a, 11, 0, a.length-1));
    }
}
