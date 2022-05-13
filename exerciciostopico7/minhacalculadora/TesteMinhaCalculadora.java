package home.nathyelson.programacaobasicaJava.exerciciostopico7.calculadora;

public class TesteMinhaCalculadora {

    public static void main(String[] args) {


        int soma = MinhaCalculadora.somar(7, 5);
        int subtracao = MinhaCalculadora.subtrair(6, 3);
        int multiplicacao = MinhaCalculadora.multiplicar(3, 3);
        int divisao = MinhaCalculadora.dividir(8, 2);
        int potenciacao = MinhaCalculadora.potenciar(2, 3);

        System.out.println("Minha calculadora de número inteiros " + "\n" +
                "Soma: " + soma + "\n" +
                "Subtração: " + subtracao + "\n" +
                "Multiplicação: " + multiplicacao + "\n" +
                "Divisão: " + divisao + "\n" +
                "Potênciação: " + potenciacao + "\n");
    }
}
