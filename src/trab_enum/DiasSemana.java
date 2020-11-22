package trab_enum;

public enum DiasSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

    int valor;

    DiasSemana(int dia){
        valor = dia;
    }

    public void queDiaEhHoje (){
        int dia = valor;
        switch (dia){
            case 1:
                System.out.println("Hoje é Domingo!");
                break;
            case 2:
                System.out.println("Hoje é Segunda!");
                break;
            case 3:
                System.out.println("Hoje é Terça!");
                break;
            case 4:
                System.out.println("Hoje é Quarta!");
                break;
            case 5:
                System.out.println("Hoje é Quinta!");
                break;
            case 6:
                System.out.println("Hoje é Sexta!");
                break;
            case 7:
                System.out.println("Hoje é Sábado!");
                break;
            default:
                System.out.println("Dia inválido.");
        }
    }
}

