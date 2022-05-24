package home.nathyelson.programacaobasicaJava.topico9.exceptions;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal: ");
        try {
            double numero = lerNumero();
            System.out.println("Você digitou um número: " + numero);
        } catch (Exception e) {
            System.out.println("Entrada inválida!");
            e.printStackTrace();
        }

    }

    public static double lerNumero() throws Exception {

        Scanner scanj = new Scanner(System.in);
        double numero = scanj.nextDouble();

        return numero;

    }

}
