public class Divisao extends ExpressaoBinaria {

    public Divisao(Expressao operandoEsquerda, Expressao operandoDireita) {
        super(operandoEsquerda, operandoDireita);
    }

    public double avaliar() {
        return getOperandoEsquerda().avaliar() / getOperandoDireita().avaliar();
    }
}
