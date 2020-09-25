package programas_colecoes;

import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetA {
    public static void main(String[] args) {
        TreeSet<Number> treeSet = new TreeSet<>();

        Random gerador = new Random();

        for(int i = 0; i < 20 ; i++){
            treeSet.add(gerador.nextInt(100));
        }

        for (Number n : Collections.unmodifiableSortedSet(treeSet)) {
            System.out.println(n);
        }
    }
}
