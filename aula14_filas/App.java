package aula14_filas;

public class App {
    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica();
        f.enfileirar("Junior");
        f.enfileirar("Samantha");
        f.enfileirar("Andreas");
        f.enfileirar("Eduarda");
        f.imprimir();

        System.out.println("Tirei o -> " + f.desenfileirar());
        f.imprimir();

        f.enfileirar("Cecilia");
        f.imprimir();
        f.enfileirar("Guilherme");
        f.enfileirar("Carolina");
        f.imprimir();

        f.enfileirar("Joao");
        f.imprimir();
    }
}
