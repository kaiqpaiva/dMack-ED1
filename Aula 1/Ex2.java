import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if("aeiou".indexOf(letra) != -1){
            System.out.println("Vogal");
        } else {
            System.out.println("Nao eh vogal");
        }
        scanner.close();
    }
}
