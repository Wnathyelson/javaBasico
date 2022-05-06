package home.nathyelson.programacaoBasicaJava.exerciciosTopico3;

import java.util.Scanner;

public class conversorFahrenheitCelsius {

            public static void main(String [] args){

            Scanner scanj = new Scanner(System.in);

            double conversaoCelsius;

            System.out.println("Digite o valor de uma temperatura em Fahrenheit: ");
            double f = scanj.nextDouble();
            conversaoCelsius = (5*(f-32)/9);
            System.out.println("O valor da temperatura Fahrenheit em Celsius é: "+ conversaoCelsius+"° Graus");

    }

}
