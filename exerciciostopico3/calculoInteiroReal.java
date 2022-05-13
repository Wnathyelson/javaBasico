package home.nathyelson.programacaobasicaJava.exerciciostopico3;

import java.util.Scanner;

public class calculoInteiroReal {

            public static void main(String [] args){

            Scanner scanj = new Scanner(System.in);

            int caso1;
            float caso2, caso3;

            System.out.println("Digite um número Inteiro: ");
            int numero1 = scanj.nextInt();
            System.out.println("Digite outro número Inteiro: ");
            int numero2 = scanj.nextInt();
            System.out.println("Digite um número Real: ");
            float numero3 = scanj.nextFloat();
            caso1 = (numero1*2)*(numero2/2);
            System.out.println("O produto dos números é: "+ caso1);
            caso2 = (numero1*3)+numero3;
            System.out.println("A soma dos números é: "+ caso2);
            caso3 = (numero3*numero3*numero3);
            System.out.println("A potência do número é: "+caso3);

    }

}
