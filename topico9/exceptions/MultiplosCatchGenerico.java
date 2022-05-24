package home.nathyelson.programacaobasicaJava.topico9.exceptions;

public class MultiplosCatchGenerico {

    public static void main(String[] args) {


        int[] numerosMultiplos = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};


        for (int i = 0; i < numerosMultiplos.length; i++) {

            try {
                System.out.println(numerosMultiplos[i] + "/" + denominadores[i] + " = " + (numerosMultiplos[i]) /
                        denominadores[i]);
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice do array inválida!");
            }catch (Throwable exc){
                System.out.println("Ocorreu um erro");
            }
            
        }

    }

}


