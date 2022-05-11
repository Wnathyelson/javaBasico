package home.nathyelson.programacaoBasicaJava.topico3;

import java.util.Scanner;

public class leituraDeDados {

    public static void main(String[] args) {

        Scanner scanj = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanj.next();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanj.next();
        System.out.println("Digite sua Idade: ");
        int Idade = scanj.nextInt();
        System.out.println("Seu nome é: " + nome + " " + sobrenome + " e tem " + Idade + " anos");

    }
}
