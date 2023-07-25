public class Multiplicacao extends ExpressaoBinaria {

    public Multiplicacao(Expressao operandoEsquerda, Expressao operandoDireita) {
        super(operandoEsquerda, operandoDireita);
    }


    public double avaliar() {
        return getOperandoEsquerda().avaliar() * getOperandoDireita().avaliar();
    }
}
