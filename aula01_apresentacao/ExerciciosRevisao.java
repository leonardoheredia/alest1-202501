package aula01_apresentacao;

public class ExerciciosRevisao {
    public static void main(String[] args) {
        System.out.println("Oi turma!!!!");
        //System.out.println(exercicio01_retornarString(10));
        int[] aux = exercicio02_retornarArrayInt(5);
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i]);
        }
    }
    public static String exercicio01_retornarString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + " " + String.valueOf(i);
        }
        return s;
    }
    public static int[] exercicio02_retornarArrayInt(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

}
