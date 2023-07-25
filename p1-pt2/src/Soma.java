public class Soma extends ExpressaoBinaria {

    public Soma(Expressao operandoEsquerda, Expressao operandoDireita) {
        super(operandoEsquerda, operandoDireita);
    }

    public double avaliar() {
        return getOperandoEsquerda().avaliar() + getOperandoDireita().avaliar();
    }
}
