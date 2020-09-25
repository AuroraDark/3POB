package programas_colecoes;

import java.util.HashMap;
import java.util.Scanner;

public class LetraE {
    public static void main(String[] args) {
        HashMap<String, Pessoa> pessoas = new HashMap<>();

        boolean continuar = true;
        int opcao;
        while (continuar){
            System.out.println("\nMENU |digite a opcao|\n\n[1]CADASTRAR PESSOA\n[2]BUSCAR PELO CPF\n[3]SAIR\n");
            Scanner lerOpcao = new Scanner(System.in);
            opcao = lerOpcao.nextInt();

            if(opcao == 1){
                System.out.println("\nNOME:");
                Scanner lerNome = new Scanner(System.in);
                String nome = lerNome.nextLine();

                System.out.println("\nSOBRENOME:");
                Scanner lerSobrenome = new Scanner(System.in);
                String sobrenome = lerSobrenome.nextLine();

                Pessoa pessoa = new Pessoa(nome,sobrenome);

                System.out.println("\nCPF:");
                Scanner lerCpf = new Scanner(System.in);
                String cpf = lerCpf.nextLine();

                pessoas.put(cpf, pessoa);

            }else if(opcao == 2){
                System.out.println("CPF:");
                Scanner lerBusca = new Scanner(System.in);
                String cpfBusca = lerBusca.nextLine();
                Pessoa encontrada = pessoas.get(cpfBusca);
                if(encontrada != null) {
                    System.out.println("\nPessoa encontrada: " + encontrada.getNome() + " " + encontrada.getSobrenome() + "\n");
                }

            }else if(opcao ==3){
                continuar = false;
            }else{
                System.out.println("Opção inválida.");
            }
        }

    }
}
