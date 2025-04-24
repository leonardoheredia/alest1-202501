import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("c:\\temp\\tale.txt"));
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
