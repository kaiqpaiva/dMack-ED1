package lab1b;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        palindromo p = new palindromo(s);

        if (p.verificar()) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
