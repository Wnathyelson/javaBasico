package home.nathyelson.programacaobasicaJava.exerciciostopico3;

import java.util.Scanner;

public class calculoMedia {

    public static void main(String [] args){

            Scanner scanj = new Scanner(System.in);

            double media;

            System.out.println("Digite a primeira nota: ");
            double nota1 = scanj.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double nota2 = scanj.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double nota3 = scanj.nextDouble();
            System.out.println("Digite a quarta nota: ");
            double nota4 = scanj.nextDouble();

            media = (nota1+nota2+nota3+nota4)/4;

            System.out.println("A média das notas é: "+ media);

    }

}
