package home.nathyelson.programacaoBasicaJava.exerciciosTopico4;

import java.util.Scanner;

public class calculoMediaDecisao {

    public static void main(String[] args) {

        Scanner scanj = new Scanner(System.in);

        double media;

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanj.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanj.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media == 10) {

            System.out.println("Sua média é: " + media + "," + " Aprovado com distinção! Parabéns");

        }

        else if (media >= 7) {

            System.out.println("Sua média é: " + media + "," + " Aprovado!");

        }

        else{

            System.out.println("Sua média é: " + media + "," + " Reprovado");

        }
    }
}

