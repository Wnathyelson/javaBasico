package home.nathyelson.programacaobasicaJava.exerciciostopico3;

import java.util.Scanner;

public class calculoPesoIdeal {

            public static void main(String [] args){

            Scanner scanj = new Scanner(System.in);

            double pesoIdeal;

            System.out.println("Digite sua altura: ");
            double altura = scanj.nextDouble();
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal seria: "+ pesoIdeal+ " Kg");

    }
}
