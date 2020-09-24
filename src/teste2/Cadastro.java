package teste2;

import java.util.LinkedList;
import java.util.Scanner;

public class Cadastro {
    public static void main (String[] args){
        var pessoas = new LinkedList<Pessoa>();
        boolean continuar = true;

        //loop do menu
        while (continuar) {
            System.out.println("\nO que deseja fazer? [DIGITE ABAIXO]");
            System.out.println("[1] Cadastrar pessoas.");
            System.out.println("[2] Buscar pelo CPF.");
            System.out.println("[3] Sair do programa.");

            Scanner lerOpcao = new Scanner(System.in);
            int opcao = lerOpcao.nextInt();

            if(opcao == 1){
                pessoas = cadastrar(pessoas);
            }else if (opcao == 2){
                buscarPeloCpf(pessoas);
            }else if (opcao == 3){
                continuar = false;
            }else {
                System.out.println("\nOpção errada. Digite novamente.");
            }
        }
    }

    //função para cadastrar
    public static LinkedList<Pessoa> cadastrar (LinkedList<Pessoa> pessoas){

        boolean maisPessoa = true;
        String nome;
        String dataNasc;
        String telefone;
        String cpf;

        while (maisPessoa){

            System.out.println("\nNovo Cadastro\n");

            System.out.println("Nome:");
            Scanner lerNome = new Scanner(System.in);
            nome = lerNome.nextLine();

            System.out.println("Data de Nascimento (dd/mm/aa):");
            Scanner lerData = new Scanner(System.in);
            dataNasc = lerData.nextLine();

            System.out.println("Telefone:");
            Scanner lerTel = new Scanner(System.in);
            telefone = lerTel.nextLine();

            System.out.println("CPF:");
            Scanner lerCpf = new Scanner(System.in);
            cpf = lerCpf.nextLine();

            Pessoa pessoa = new Pessoa(nome,cpf,telefone,dataNasc);
            pessoas.add(pessoa);

            System.out.println("\nQuer cadastrar mais pessoas? (S/N)");
            Scanner lerCadastrarMais = new Scanner(System.in);
            String cadMais = lerCadastrarMais.nextLine();

            if(cadMais.equals("N") || cadMais.equals("n")){
                maisPessoa = false;
            }
        }
        return pessoas;
    }

    //função da busca
    public static void buscarPeloCpf (LinkedList<Pessoa> pessoas){

        System.out.println("\nDigite o CPF que deseja buscar: ");
        Scanner lerCpf = new Scanner(System.in);
        String cpfBusca = lerCpf.nextLine();

        cpfBusca = cpfBusca.replace(" ", "").replace("-", "").replace(".", "");

        int indexEncontrado = -1;

        //se encontrar o cpf vai retornar o índice, se não, o index vai ser -1
        for (int i = 0 ; i < pessoas.size(); i++){
            if(pessoas.get(i).getCpf().equals(cpfBusca)){
                indexEncontrado = i;
            }
        }

        if(indexEncontrado == -1){
            System.out.println("\nPessoa não encontrada.");
        } else {
            System.out.println("\nPessoa encontrada!\nDados:");
            System.out.println("Nome: " + pessoas.get(indexEncontrado).getNome());
            System.out.println("Data de Nascimento: " + pessoas.get(indexEncontrado).getDataNasc());
            System.out.println("Telefone: " + pessoas.get(indexEncontrado).getTelefone());
            System.out.println("CPF: " + pessoas.get(indexEncontrado).getCpf());
        }
    }
}
