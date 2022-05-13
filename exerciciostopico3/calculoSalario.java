package home.nathyelson.programacaobasicaJava.exerciciostopico3;

import java.util.Scanner;

public class calculoSalario {

    public static void main(String [] args){

        Scanner scanj = new Scanner(System.in);

        double calculoSalario;

        System.out.println("Digite o valor por hora de trabalho R$: ");
        double valorHora = scanj.nextInt();
        System.out.println("Digite Quantas horas você trabalhou neste mês: ");
        int horaMensal = scanj.nextInt();
        calculoSalario = valorHora * horaMensal;
        System.out.println("Valor do salário: R$ "+ calculoSalario);

    }
}
