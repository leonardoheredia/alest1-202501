package aula03_exercicio_complexidade;

public class Exemplo {

    public static void main(String[] args) {
        //digamos que o algoritmo exemplo1
        //retorna a quantidade de operacoes
        System.out.println(exemplo5(10));
        System.out.println(exemplo5(20));
        System.out.println(exemplo5(30));
        System.out.println(exemplo5(40));
        System.out.println(exemplo5(50));
    }

    public static int exemplo1(int n) {
        int x = 20;
        int y = 3 * n;
        return y;
    }

    public static int exemplo2(int n) {
        n = n * n;
        int y = n + 50;
        y = 10;
        return y;
    }

    public static int exemplo3(int n) {
        int z = n * n;
        return z;
    }

    public static int exemplo4(int n) {
        int z = n * n * n;
        return z;
    }

    public static long exemplo5(int n) {
        double z = Math.pow((double)2, (double)n);
        return (long) z;
    }


}
