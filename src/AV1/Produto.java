package AV1;
        /** Classe dos produtos da Farmácia.
        * @author Fillipe
        * @version 1.0
        */
public class Produto {

    //ENCAPSULAMENTO
    private int preco;
    private String nome;


    //MÉTODO CONSTRUTOR
    public Produto(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    //GETTERS E SETTERS
            /** Retorna o nome do produto.
             *  @author Fillipe
             *  @return String - nome do produto.
             */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    //MÉTODO QUE RETORNA VALOR EM REAIS

            /** Retorna o preço em formato de moeda (R$)
             *  @author Fillipe
             *  @return String - preço em reais.
             */
    public String precoReais() {
        return "R$" + preco + ",00";
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
