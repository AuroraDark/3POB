package teste1;

public class Paciente {
    private String nome;
    private String prioridade;

    public Paciente (String nome,  String prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public String getPrioridade() {
        return prioridade;
    }
}
