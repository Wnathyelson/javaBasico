package home.nathyelson.programacaoBasicaJava.exerciciosTopico3;

import java.util.Scanner;

public class calculoImpostosSalario {

    public static void main(String[] args) {

        Scanner scanj = new Scanner(System.in);

        double salarioBruto, inss, sindicato, impostoRenda, descontos, salarioLiquido;

        System.out.println("Informe o valor por hora de trabalho R$: ");
        double valorHora = scanj.nextDouble();
        System.out.println("Informe quantas horas você trabalhou neste mês: ");
        double horaMensal = scanj.nextDouble();

        salarioBruto = valorHora * horaMensal;
        System.out.println("Valor de salário bruto: R$ " + salarioBruto);

        inss = (salarioBruto / 100) * 8;
        sindicato = (salarioBruto / 100) * 5;
        impostoRenda = (salarioBruto / 100) * 11;
        descontos = inss + sindicato + impostoRenda;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Taxa do INSS: R$ " + inss);
        System.out.println("Taxa do Sindicato: R$ " + sindicato);
        System.out.println("Taxa do Imposto de renda: R$ " + inss);

        System.out.println("Total de descontos: R$ " + descontos);

        System.out.println("Valor do salário liquído: R$ " + salarioLiquido);
    }
}
