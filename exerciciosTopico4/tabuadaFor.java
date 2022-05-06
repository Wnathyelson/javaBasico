package home.nathyelson.programacaoBasicaJava.exerciciosTopico4;

import java.util.Scanner;

public class tabuadaFor {

        public static void main(String[] args) {

                Scanner scanj = new Scanner(System.in);

                System.out.println("Tabuada do número 10, escolha uma operação: \n" +
                        "1- + (Adição)\n" +
                        "2- - (Subtração)\n" +
                        "3- * (Multiplicação)\n" +
                        "4- / (Divisão)\n");
                int operacao = scanj.nextInt();

                System.out.println("Digite um número de 1 a 10: ");
                int num = scanj.nextInt();

                for (int i = 1; i <= 10; i++) {
                        switch (operacao) {

                                case 1:
                                        System.out.println(num + "+" + i + "= " + (num + i));
                                        break;

                                case 2:
                                        System.out.println(num + "-" + i+ "= " + (num - i));
                                        break;

                                case 3:
                                        System.out.println(num + "x" + i + "= " + (num * i));
                                        break;

                                case 4:
                                        System.out.println(num + "/" + i + "= " + (num / i)+
                                                " Resto da divisão: "+
                                                (num%i));
                                        break;

                                default:
                                        System.out.println("Operação inválida!");
                        }

                }
        }
}



