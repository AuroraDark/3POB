package programas_colecoes;

import java.util.LinkedList;
import java.util.Scanner;

public class LetraD {
    public static void main(String[] args) {
        LinkedList<Number> divisores = new LinkedList<>();
        int numero;

        System.out.println("Número: ");
        Scanner lerNum = new Scanner(System.in);
        numero = lerNum.nextInt();

        for (int i = numero ; i >= 2 ; i--){
            if(numero % i == 0){
                divisores.add(i);
            }
        }

        divisores.forEach(System.out::println);
    }
}
