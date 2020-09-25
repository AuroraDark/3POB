package programas_colecoes;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListA {
    public static void main(String[] args) {
        LinkedList<Number> linkedList = new LinkedList<>();
        Random gerador = new Random();

        for(int i = 0; i < 20 ; i++){
            linkedList.add(gerador.nextInt(100));
        }

        for (Number n : linkedList) {
            System.out.println(n);
        }
    }
}
