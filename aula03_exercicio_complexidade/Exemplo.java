package aula03_exercicio_complexidade;

public class Exemplo {

    public static void main(String[] args) {
        System.out.println("n;alg_02(n);alg_03;alg_05");
        for(int n=1; n<=1000; n+=50) {
            System.out.println(n + ";" + alg_01(n) + ";" + alg_02(n) + ";" + alg_03(n));
        }

    }

    public static int alg_02(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                operacoes++;
        return operacoes;
    }

    public static int alg_03(int n) {
        int operacoes = 100000;
        return operacoes;
    }

    public static int alg_01(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++) {
            operacoes++;
        }
        operacoes = 3*operacoes+300000;
        return operacoes;
    }



}
