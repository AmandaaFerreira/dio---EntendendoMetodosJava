import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Criação de Quadrilatero - utilizando Sobrecarga
        System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5D,5D);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5F,5F);

        //Criação de Quadrilatero - utilizando Retornos
        System.out.println("Exercicio retornos");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5D,5D);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do trapézio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5F, 5F);
        System.out.println("Area do losango: " + areaLosango);
    }
}
