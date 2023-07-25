public abstract class ExpressaoBinaria implements Expressao{

    private Expressao operandoEsquerda;
    private Expressao operandoDireita;

    public ExpressaoBinaria(Expressao operandoEsquerda, Expressao operandoDireita) {
        this.operandoEsquerda = operandoEsquerda;
        this.operandoDireita = operandoDireita;
    }

    public Expressao getOperandoEsquerda() {
        return operandoEsquerda;
    }

    public Expressao getOperandoDireita() {
        return operandoDireita;
    }
}
