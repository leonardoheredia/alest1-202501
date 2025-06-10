package aula29_avl_completa;

public class App {
    public static void main(String[] args) {
        ArvoreAVL avl = new ArvoreAVL();
        avl.adicionar(30);
        avl.adicionar(15);
        avl.adicionar(80);
        avl.adicionar(10);
        avl.adicionar(8);
        avl.adicionar(90);
        avl.adicionar(70);

        avl.imprimirArvore();
        System.out.println(avl.obterAltura());
    }
}
