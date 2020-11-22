package AV1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Farmacia {

    public static void main (String[] args){ // ->> //FILLIPE

        //TIPOS PRIMITIVOS / TIPOS DE REFERÊNCIA
        boolean parar = false;
        String planodesaude;
        double valorCompra = 0;
        double valorComDesconto = 0;
        String novaCompra;

        //COLEÇÕES: ArrayList e LinkedList

        //DECLARAÇÃO
        ArrayList<String> sacolaNomes = new ArrayList<String>();
        LinkedList<Produto> listaprodutos = new LinkedList<Produto>();

        //CONSTRUTOR NEW - CRIANDO OBJETOS DE PRODUTO
        Produto dorflex = new Produto(10, "Dorflex");
        Produto clonazepam = new Produto(20, "Clonazepam");
        Produto pastaDeDente = new Produto(5, "Pasta de Dente");
        Produto polaramine = new Produto(15, "Polaramine");
        Produto agua = new Produto(2, "Água");
        Produto barrinhaCereal = new Produto(5, "Barrinha Cereal");
        Produto sabonete = new Produto(2, "Sabonete");
        Produto shampoo = new Produto(10, "Shampoo");
        Produto condicionador = new Produto(11, "Condicionador");
        Produto fralda = new Produto(10, "Fralda");
        Produto desodorante = new Produto(8, "Desodorante");
        Produto alcoolEmGel = new Produto(20, "Álcool em Gel");
        Produto mascara = new Produto(5, "Máscara");
        Produto xaropeDeMel = new Produto(12, "Xarope de Mel");
        Produto hidratanteNivea = new Produto(20, "Hidratante Nívea");
        Produto escovaDeDente = new Produto(13, "Escova de Dente");
        Produto protetorSolar = new Produto(50, "Protetor Solar");
        Produto vitaminas = new Produto(30, "Vitaminas");


        //ADICIONANDO PRODUTOS NA LINKEDLIST
        adicionandoProdutos(listaprodutos, dorflex, clonazepam, pastaDeDente, polaramine, agua, barrinhaCereal, sabonete, shampoo, condicionador, fralda, desodorante, alcoolEmGel, mascara, xaropeDeMel, hidratanteNivea, escovaDeDente, protetorSolar, vitaminas);


        //LOOP PARA ATENDER MAIS DE UM CLIENTE

        while (parar == false){

            //PERCORRER A LISTA UTILIZANDO ITERATOR
            Iterator<Produto>produto = listaprodutos.iterator();
            while(produto.hasNext()) {
                Produto atual = produto.next();
                System.out.println(listaprodutos.indexOf(atual) + " - " + atual.getNome() + ": " + atual.precoReais());
            }

            System.out.println("Digite os números dos produtos que você deseja levar, separados por ESPAÇOS.");
            Scanner enterProdutos = new Scanner(System.in);
            String sacolaString = enterProdutos.nextLine();

            //CRIANDO UM NOVO ARRAY COM OS ELEMENTOS SEPARADOS PELO ESPAÇO
            String[] sacola = sacolaString.split(" ");

            System.out.println("Possui plano de Saúde? (s/n)");
            Scanner possuiPlano = new Scanner(System.in);
            planodesaude = possuiPlano.nextLine();

            //PERCORRER ELEMENTOS DO ARRAY COM UM FOR ->> //ANDRESSA
            for (int n = 0; n < sacola.length ; n++){

                int index = Integer.parseInt(sacola[n]);

                //ARRAY COM OS NOMES DOS PRODUTOS E UM CONTADOR COM O VALOR TOTAL DA COMPRA SENDO INCREMENTADO
                sacolaNomes.add(listaprodutos.get(index).getNome());
                valorCompra += listaprodutos.get(index).getPreco();
            }

            //PRINTANDO OS PRODUTOS DA SACOLA COM O FOR EACH
            System.out.println("\nProdutos da sua sacola:\n");
            sacolaNomes.forEach(nome -> System.out.println(nome));

            //VERIFICANDO SE POSSUI PLANO DE SAÚDE / SE SIM APLICA DESCONTO
            if(planodesaude.equals("S") || planodesaude.equals("s")) {
                System.out.println("Qual o seu plano de saúde?\n1-Amil\n2-Unimed\n3-Cassi\n4-Sulamerica\n5-Assim\n6-Bradesco\n7-Golden Cross\n\nDigite: ");
                Scanner lerPlano = new Scanner(System.in);
                int plano = lerPlano.nextInt();
                ArrayList<Convenio> convenios = new ArrayList<Convenio>();


                //ADICIONANDO CONVENIOS COM VARARGS
                adicionandoConvenios(convenios, Convenio.AMIL, Convenio.UNIMED, Convenio.CASSI, Convenio.SULAMERICA, Convenio.BRADESCO, Convenio.GOLDENCROSS);

                valorComDesconto = valorCompra * (1 - convenios.get(plano-1).getDesconto());
                System.out.println("\nValor Total: " + valorCompra);
                System.out.println("Valor com Desconto do Plano de Saúde "+ (int)(100 * convenios.get(plano-1).getDesconto())+"%: " + valorComDesconto);
            } else {
                System.out.println("Valor Total: " + valorCompra);
            }

            System.out.println("\nNova compra? (s/n)");
            Scanner novaCompraEnter = new Scanner(System.in);
            novaCompra = novaCompraEnter.nextLine();
            valorCompra = 0;
            valorComDesconto = 0;
            sacolaNomes.clear();
            //VERIFICANDO SE QUER FAZER NOVA COMPRA / SE SIM O WHILE RODA DE NOVO
            if(novaCompra.equals("S") || novaCompra.equals("s")){
                parar = false;
            } else {
                parar = true;
            }
        }


    }

    static void adicionandoProdutos (LinkedList listaprodutos, Produto... ultimoProduto){

        for(Produto produto : ultimoProduto){
            listaprodutos.add(produto);
        }
    }

    static void adicionandoConvenios(ArrayList convenios, Convenio... ultimoConvenio){

        for(Convenio convenio : ultimoConvenio){
            convenios.add(convenio);
        }
    }

}
