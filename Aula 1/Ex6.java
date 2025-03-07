import java.util.Scanner;

public class Ex6 {
    public static float mulComAdicao(float a, int b){
        float multiplicacao = 0;
        for(int i = 0; i < b; i++){
            multiplicacao += a;
        }
        return multiplicacao;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        int b = scanner.nextInt();

        System.out.println("A multiplicacao sera: " + mulComAdicao(a, b));

    scanner.close();
    }
}
