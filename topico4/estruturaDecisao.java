package home.nathyelson.programacaoBasicaJava.topico4;

import java.util.Scanner;

public class estruturaDecisao {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe o valor 1: ");
        int num1 = scanf.nextInt();
        System.out.println("Informe o valor 2: ");
        int num2 = scanf.nextInt();

        if (num1 == 1 && num2 == 2) {

            System.out.println("Condição verdadeira");

        } else if (num1 < num2) {

            System.out.println("Valor 1 é menor que valor 2");

        } else {

            System.out.println("O valor 1 é maior");
        }
    }

}
