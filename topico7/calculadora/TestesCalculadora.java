package home.nathyelson.programacaobasicaJava.topico7.calculadora;

public class TestesCalculadora {

    public static void main(String[] args) {

        //Calculadora calcularSoma = new Calculadora();

        int soma1 = Calculadora.soma(1, 2);

        int soma2 = Calculadora.soma(1, 2, 3);

        double soma3 = Calculadora.soma(1.5, 2.5);

        System.out.println("Somando na calculadora: " + "\n" +
                "Soma de dois números inteiros: " + soma1 + "\n" +
                "Soma de três números inteiros: " + soma2 + "\n" +
                "Soma de dois números com ponto flutuante: " + soma3);
    }
}
