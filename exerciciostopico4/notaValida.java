package home.nathyelson.programacaobasicaJava.exerciciostopico4;

import java.util.Scanner;

public class notaValida {

    public static void main(String[] args) {

        Scanner scanj = new Scanner(System.in);

        boolean notaValidada = false; // flag

        while (!notaValidada) {

            System.out.println("Digite uma nota: ");
            double nota = scanj.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValidada = true;
                System.out.println(nota + " É uma nota válida!");
            } else {
                System.out.println("Nota digitada inválida, tente novamente!");
            }

        }
    }
}


