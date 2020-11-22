package AV1;

/** Classe enum que determina os planos de saúde, e seus descontos.
 * @author Andressa
 * @version 1.0
 */
public enum Convenio {

    AMIL(1,0.2),
    UNIMED(2,0.25),
    CASSI(3,0.30),
    SULAMERICA(4,0.32),
    ASSIM(5,0.27),
    BRADESCO(6,0.29),
    GOLDENCROSS(7,0.22);

    private double desconto;
    private int index;

    Convenio(int index, double desconto){
       this.desconto = desconto;
       this.index = index;
    }

    /** Retorna o percentual de desconto.
     *  @author Andressa
     *  @return double - percentual de desconto.
     */
    public double getDesconto(){
        return desconto;
    }
}
