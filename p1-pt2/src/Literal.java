public class Literal implements Expressao {
    private double valor;

    public Literal(double valor) {
        this.valor = valor;
    }

    public double avaliar(){
        return this.valor;
    }
}
