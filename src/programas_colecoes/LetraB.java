package programas_colecoes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LetraB {
    public static void main(String[] args) {
        System.out.println("Entre com os 10 nomes:\n");
        String nome;
        LinkedList<String> impares = new LinkedList<>();
        HashSet<String> pares = new HashSet<>();

        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("Nome "+i+":");
            Scanner lerNome = new Scanner(System.in);
            nome = lerNome.nextLine();
            int nLetras = nome.length();

            if(nLetras % 2 == 0){
                pares.add(nome);
            }else{
                impares.add(nome);
            }
        }
        System.out.println("\nÍmpares:\n");
        impares.forEach(System.out::println);
        System.out.println("\nPares:\n");
        pares.forEach(System.out::println);
    }
}
