package home.nathyelson.programacaobasicaJava.topico9.exceptions;

public class ExcecaoPropria {

    public static void main(String[] args) {


        int[] numerosMultiplos = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};


        for (int i = 0; i < numerosMultiplos.length; i++) {

            try {
                if (numerosMultiplos[i] % 2 != 0) {
                    throw new NaoInteiroException(numerosMultiplos[i], denominadores[i]);
                }
                System.out.println(numerosMultiplos[i] + "/" + denominadores[i] + " = " + (numerosMultiplos[i]) /
                        denominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException e) {
                System.out.println("Ocorreu um erro!");
                e.printStackTrace();
                System.out.println(e.getMessage());

            }

        }

    }

}

