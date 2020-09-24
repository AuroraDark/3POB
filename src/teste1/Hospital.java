package teste1;

import java.util.LinkedList;
import java.util.Scanner;

public class Hospital {
    public static void main (String[] args){
        LinkedList<Paciente> pacientes = new LinkedList<Paciente>();
        LinkedList<String> comPrioridade = new LinkedList<String>();
        LinkedList<String> semPrioridade = new LinkedList<String>();

        boolean maisPaciente = true;
        String nomePaciente;
        String prioridade;

        while (maisPaciente) {

            System.out.println("Seja bem-vindo, paciente!");
            System.out.println("Possui prioridade? (S/N)\n");

            Scanner lerPrioridade = new Scanner(System.in);
            prioridade = lerPrioridade.nextLine();

            //VALIDANDO ENTRADA

            if(prioridade.equals("S") || prioridade.equals("s") || prioridade.equals("N") || prioridade.equals("n")) {

                System.out.println("Qual o seu nome?");

                Scanner lerNome = new Scanner(System.in);
                nomePaciente = lerNome.nextLine();

                Paciente novoPaciente = new Paciente(nomePaciente, prioridade);
                pacientes.add(novoPaciente);

                if (prioridade.equals("S") || prioridade.equals("s")) {
                    comPrioridade.add(novoPaciente.getNome());
                } else {
                    semPrioridade.add(novoPaciente.getNome());
                }

                System.out.println("Chegou mais algum paciente? (S/N)\n");
                Scanner lerPaciente = new Scanner(System.in);
                String verifMaisPaciente = lerPaciente.nextLine();

                if (verifMaisPaciente.equals("N") || verifMaisPaciente.equals("n")) {
                    maisPaciente = false;
                }
            }
            else {
                System.out.println("Entrada inválida... Tente novamente");
            }

        }

        System.out.println("Todos os pacientes: ");
        pacientes.forEach(paciente -> System.out.println((pacientes.indexOf(paciente) + 1) + " - " + paciente.getNome()));

        System.out.println("\nFila de Pacientes COM PRIORIDADE:");
        comPrioridade.forEach(paciente -> System.out.println((comPrioridade.indexOf(paciente) + 1)  + " - " + paciente));

        System.out.println("\nFila de Pacientes SEM PRIORIDADE:");
        semPrioridade.forEach(paciente -> System.out.println((semPrioridade.indexOf(paciente) + 1) + " - " + paciente));
    }
}
