package programas_colecoes;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListA {
    public static void main(String[] args) {
        ArrayList<Number> arraylist = new ArrayList<>();
        Random gerador = new Random();

        for(int i = 0; i < 20 ; i++){
            arraylist.add(gerador.nextInt(100));
        }

        for (Number n : arraylist) {
            System.out.println(n);
        }
    }
}
