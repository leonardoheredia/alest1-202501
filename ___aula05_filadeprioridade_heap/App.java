package ___aula05_filadeprioridade_heap;

public class App {
    public static void main(String[] args) {
        HeapMax h = new HeapMax();
        h.inserir(50);
        System.out.println(h);
        h.inserir(60);
        System.out.println(h);
        h.inserir(30);
        System.out.println(h);
        h.inserir(100);
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);


    }
}
