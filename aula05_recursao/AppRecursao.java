package aula05_recursao;

public class AppRecursao {
    public static void main(String[] args) {
        System.out.println(fatorialRecursivo(10));
        System.out.println(fatorialNaoRecursivo(10));

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

    public static void inverterArrayNaoRecursivo(int[] a) {

    }
    public static void inverterArrayRecursivo(int[] a, int aux) {
        ///
    }



    public static void escrever(int n) {
        if(n>0) {
            System.out.println("oi");
            escrever(n - 1);
        }
    }





}
