package home.nathyelson.programacaobasicaJava.topico9.exceptions;

public class MultiplosCatchSimilar {

    public static void main(String[] args) {


        int[] numerosMultiplos = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};


        for (int i = 0; i < numerosMultiplos.length; i++) {

            try {
                System.out.println(numerosMultiplos[i] + "/" + denominadores[i] + " = " + (numerosMultiplos[i]) /
                        denominadores[i]);
            } catch (ArithmeticException | IndexOutOfBoundsException exception) {
                System.out.println("Ocorreu um erro!");
            }

        }

    }

}


