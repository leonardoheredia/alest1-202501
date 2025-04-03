package aula11_listaslineares;

public class App {
    public static void main(String[] args) {
        ListaEstatica l = new ListaEstatica();
        l.adicionar("leite");
        l.adicionar("suco");
        l.adicionar("pao");
        System.out.println(l);

        System.out.println(l.contem("tomate"));
        System.out.println(l.contem("suco"));
    }
}
