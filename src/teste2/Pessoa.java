package teste2;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNasc;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String telefone, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    //GETTERS

    public String getNome() {
        return nome;
    }

    //para o caso do cpf vir com espaços ou traços
    public String getCpf() {
        String newCpf;

        newCpf = cpf.replace(" ", "").replace("-", "").replace(".", "");
        return newCpf;
    }

    // tira os espaços e barras da data e escreve o mês por extenso
    public String getDataNasc() {

        String[] newData;
        String newDataString;
        String newDataEscrita;

        newDataString = dataNasc.replace(" ", "");
        newData = newDataString.split("/");

        switch (newData[1]) {
            case "1", "01" -> newData[1] = "Janeiro";
            case "2", "02" -> newData[1] = "Fevereiro";
            case "3", "03" -> newData[1] = "Março";
            case "4", "04" -> newData[1] = "Abril";
            case "5", "05" -> newData[1] = "Maio";
            case "6", "06" -> newData[1] = "Junho";
            case "7", "07" -> newData[1] = "Julho";
            case "8", "08" -> newData[1] = "Agosto";
            case "9", "09" -> newData[1] = "Setembro";
            case "10" -> newData[1] = "Outubro";
            case "11" -> newData[1] = "Novembro";
            default -> newData[1] = "Dezembro";
        }

        newDataEscrita = newData[0] + " de " + newData[1] + " de " + newData[2];

        return newDataEscrita;
    }

    public String getTelefone() {
        return telefone;
    }

}
