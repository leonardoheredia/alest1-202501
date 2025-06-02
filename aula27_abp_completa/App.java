package aula27_abp_completa;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa t = new ArvoreBinariaPesquisa();

        t.adicionar(100);
        t.adicionar(60);
        t.adicionar(40);
        t.adicionar(180);
        t.adicionar(200);
        t.adicionar(144);

        t.imprimirArvore();

        System.out.println(t.caminharLargura());
        System.out.println(t.obterNivel(40));
    }
}
