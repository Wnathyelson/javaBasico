package home.nathyelson.programacaoBasicaJava.exerciciosTopico3;

import java.util.Scanner;

public class calculoSalario {

    public static void main(String [] args){

        Scanner scanj = new Scanner(System.in);

        double calculoSalario;

        System.out.println("Digite o valor por hora de trabalho: ");
        double valorHora = scanj.nextInt();
        System.out.println("Digite Quantas horas você trabalhou neste mês: ");
        int horaMensal = scanj.nextInt();
        calculoSalario = valorHora * horaMensal;
        System.out.println("Seu salário deste mês é de: "+ calculoSalario);

    }
}