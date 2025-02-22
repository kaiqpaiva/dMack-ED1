import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = scanner.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Os valores trocados agora serao: Valor1 = " + num1 + " e Valor2 = " + num2);
    }
}
