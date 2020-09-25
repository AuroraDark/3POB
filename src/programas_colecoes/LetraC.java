package programas_colecoes;

import java.util.LinkedList;

public class LetraC {
    public static void main(String[] args) {
        boolean continuar = true;
        LinkedList<Integer> primos = new LinkedList<>();
        primos.add(2);
        primos.add(3);
        int contDivisao = 0;
        int n = 4;

        while(continuar){

            if(n % 2 != 0) {
                for(int i = 2 ; i <= n / 2  ; i++){
                    if(n % i == 0){
                        contDivisao++;
                    }
                }

                if(contDivisao == 0){
                    primos.add(n);
                }
            }

            if(primos.size() == 100){
                continuar=false;
            }else{
                n++;
                contDivisao = 0;
            }
        }
        primos.forEach(num -> System.out.println((primos.indexOf(num) + 1) + " -> " + num));
    }
}
