import java.util.Scanner;
import java.util.LinkedList;

public class Ex3 {

    public static void bbsort(ArrayList<Integer> v, Integer n){
        for(int i = 0; i < n; i++){
            for(int j = 0 ;j < n ; j++){
                if(v[j] > v[j + 1]){
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();
        for(int i = 0; i < 10; i++){

            int numero = scanner.nextInt();
            //int maior_temp;
            lista.add(numero);
        }
        int tamanho = lista.size();

        bbsort(lista, tamanho);

    }
}
