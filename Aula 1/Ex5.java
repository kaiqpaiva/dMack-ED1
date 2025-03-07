import java.util.Scanner;

public class Ex5 {
    public static int min(int a, int b){
        if(a < b){
            return a;
        }
        return b;
    }   

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Menor numero: " + min(a, b) + "\nMaior numero: " + max(a, b));
        
        scanner.close();
    }
}