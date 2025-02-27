import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        
        while(true){
            System.out.print("Digite um numero: ");
            if(scanner.hasNextInt()){
                num1 = scanner.nextInt();
                break;
            }else{
                System.out.println("Entrada incorreta");
                scanner.next();
            }
        }
        while(true){
            System.out.print("Digite outro numero: ");
            if(scanner.hasNextInt()){
                num2 = scanner.nextInt();
                break;
            }else{
                System.out.println("Entrada incorreta");
                scanner.next();
            }
        }
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Os valores trocados agora serao: Valor1 = " + num1 + " e Valor2 = " + num2);
        
        scanner.close();
    }
}
