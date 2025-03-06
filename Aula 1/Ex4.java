import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for(int i = 0; i < 10; i++){
            pilha.push(scanner.nextInt());
        }

        System.out.println(pilha);

        while(!pilha.isEmpty()){
            lista.add(pilha.pop());
        }
        System.out.println(lista);
        scanner.close();
    }
}
