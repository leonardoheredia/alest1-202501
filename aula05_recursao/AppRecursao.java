package aula05_recursao;

import utils.ArrayUtils;

import java.util.ArrayList;

public class AppRecursao {
    public static void main(String[] args) {
        int a[] = {88,75,15,99,63,28};
        ArrayUtils.imprimirComPosicao(a);
        inverterArrayRecursivo(a, 0);
        System.out.println();
        ArrayUtils.imprimirComPosicao(a);
    }
    public static void inverterArrayRecursivo(int[] a, int aux) {
        if(aux>=(a.length/2)) return;
        int temp = a[aux];
        a[aux] = a[a.length-1-aux];
        a[a.length-1-aux] = temp;
        inverterArrayRecursivo(a, aux + 1);
    }
    public static void inverterArrayNaoRecursivo(int[] a) {
        for (int i = 0; i < (a.length/2); i++) {
            int temp = a[i];
            a[i]            = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }





    public static int fatorialRecursivo(int n) {
        if(n<0) return -1;
        else if(n==0 || n==1) return 1;
        else {
            System.out.println(n + " * " + (n - 1) + "!");
            return n * fatorialRecursivo(n -1);
        }
    }

    public static int fatorialNaoRecursivo(int n) {
        int f = 1;
        for (int i = n; i >0 ; i--) {
            f = f * i;
        }
        return f;
    }



    public static int somatorio(int n) {
        if(n==0) return 0;
        else {
            return n + somatorio(n - 1);
        }
    }





    public static void escrever(int n) {
        if(n>0) {
            System.out.println("oi");
            escrever(n - 1);
        }
    }





}
