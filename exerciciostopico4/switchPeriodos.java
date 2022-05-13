package home.nathyelson.programacaobasicaJava.exerciciostopico4;

import java.util.Scanner;

public class switchPeriodos {

        public static void main(String[] args) {

                Scanner scanj = new Scanner(System.in);

                System.out.println("Escolha o número que representa o periódo em que estuda: \n" +
                        "1-Matutino\n" +
                        "2-Vespertino\n" +
                        "3-Noturno\n");

                int periodo = scanj.nextInt();

                switch (periodo){

                    case 1: System.out.println("Bom dia!"); break;
                    case 2: System.out.println("Boa tarde!");break;
                    case 3: System.out.println("Boa noite!");break;
                    default: System.out.println("Periódo informado inválido");
                }

    }

}
