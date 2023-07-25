public class Main {
    public static void main(String[] args) {

        Literal literal1 = new Literal(1);
        Literal literal2 = new Literal(2);
        Literal literal3 = new Literal(3);
        Literal literal4 = new Literal(4);
        Literal literal12 = new Literal(12);
        Subtracao subtracao = new Subtracao(literal1,literal2 );
        Literal resultadoSubtracao = new Literal(subtracao.avaliar());
        Multiplicacao multiplicacao = new Multiplicacao(resultadoSubtracao,literal3);
        Literal resultadoMultiplicacao = new Literal(multiplicacao.avaliar());
        Divisao divisao = new Divisao(literal4,literal12);
        Literal resultadoDivisao = new Literal(divisao.avaliar());
        Soma somar = new Soma(resultadoMultiplicacao,resultadoDivisao);
        System.out.println(somar.avaliar());
    }
}