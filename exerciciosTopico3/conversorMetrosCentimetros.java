package home.nathyelson.programacaoBasicaJava.exerciciosTopico3;

import java.util.Scanner;

public class conversorMetrosCentimetros {

        public static void main(String [] args){

            long centimetros = 100;
            float conversao;

            Scanner scanj = new Scanner(System.in);

            System.out.println("Digite a metragem: ");
            float metros = scanj.nextFloat();
            conversao = metros * centimetros;
            System.out.println("valor da metragem em centimetros é: "+ conversao);



        }

}
