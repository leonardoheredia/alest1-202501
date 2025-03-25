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
            if(a[i] < b[j]) {
                m[k] = a[i];
                i++;
                k++;
            }
            else {
                m[k] = b[j];
                j++;
                k++;
            }
        }
        return m;
    }
        public static void main(String[] args) {
        int[] a = {10, 14, 20};
        int[] b = {12, 15, 32};

        int[] m = mergearOrdenado(a, b);
        ArrayUtils.imprimir(m);
    }
}
