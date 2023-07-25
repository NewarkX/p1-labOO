public class Subtracao extends ExpressaoBinaria {

    public Subtracao(Expressao operandoEsquerda, Expressao operandoDireita) {
        super(operandoEsquerda, operandoDireita);
    }

    public double avaliar() {
        return getOperandoEsquerda().avaliar() - getOperandoDireita().avaliar();
    }
}
