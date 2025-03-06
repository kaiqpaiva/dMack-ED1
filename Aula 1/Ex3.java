import java.util.Scanner;
import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < 10; i++){

            lista.add(scanner.nextInt());
        }

        int maior = lista.get(0);

        for(int i = 0; i < 10; i++){
            if(lista.get(i) > maior){
                maior = lista.get(i);
            }
        }
        for(int i = 0; i < 10; i++){
            if(lista.get(i) < menor){
                menor = lista.get(i);
            }
        }   
        System.out.println("menor numero: " + menor + " maior numero: " + maior);
        scanner.close();
    }
}
