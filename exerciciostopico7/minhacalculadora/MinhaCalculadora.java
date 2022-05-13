package home.nathyelson.programacaobasicaJava.exerciciostopico7.calculadora;

public class MinhaCalculadora {


    public static int somar(int numero1, int numero2) {

        return numero1 + numero2;

    }

    public static int subtrair(int numero1, int numero2) {

        return numero1 - numero2;

    }

    public static int multiplicar(int numero1, int numero2) {

        return numero1 * numero2;

    }

    public static int dividir(int numero1, int numero2) {

        return numero1 / numero2;

    }

    public static int potenciar(int base, int expoente) {

        int potencia = 1;

        for (int i = 1; i <= expoente; i++) {

            potencia *= base;

        }
        return potencia;
    }

}
