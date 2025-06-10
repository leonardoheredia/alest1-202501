package aula29_avl_completa;

public class App {
    public static void main(String[] args) {
        ArvoreAVL avl = new ArvoreAVL();
        avl.adicionar(30);
        avl.adicionar(15);
        avl.adicionar(80);
        avl.adicionar(10);
        avl.adicionar(5);

        avl.imprimirArvore();
        System.out.println(avl.obterAltura());
    }
}
