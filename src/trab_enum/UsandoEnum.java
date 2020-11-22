package trab_enum;

//São usados para a criação de estruturas de dados organizados,
//podendo agrupar valores que tenham o mesmo sentido para dentro dessa estrutura.

//São tipos de campos que consistem em um conjunto fixo de constantes (static final),
//sendo como uma lista de valores pré-definidos. Na linguagem de programação Java, pode
//ser definido um tipo de enumeração usando a palavra chave enum.

//As instâncias dos tipos enum são criadas e nomeadas junto com a declaração da classe,
//sendo fixas e imutáveis (o valor é fixo).

//Não é permitido criar novas instâncias com a palavra chave new;

//Seguindo a convenção, por serem objetos constantes e imutáveis (static final), os nomes
//declarados recebem todas as letras em MAIÚSCULAS;

public class UsandoEnum {

    public static void main(String[] args) {
        DiasSemana domingo = DiasSemana.DOMINGO;
        DiasSemana segunda = DiasSemana.SEGUNDA;
        DiasSemana terca = DiasSemana.TERCA;

        domingo.queDiaEhHoje();
        segunda.queDiaEhHoje();
        terca.queDiaEhHoje();
    }
}
