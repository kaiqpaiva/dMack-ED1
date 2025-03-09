import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int cont = 0;

        char[] caracteres = text.toCharArray();

        for(char c : caracteres){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cont++;
            }
        }
        System.out.println(cont);
        scanner.close();
    }
}
