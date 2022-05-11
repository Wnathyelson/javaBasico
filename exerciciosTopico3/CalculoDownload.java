package home.nathyelson.programacaoBasicaJava.exerciciosTopico3;

import java.util.Scanner;

public class CalculoDownload {

    public static void main(String[] args) {

        Scanner scanj = new Scanner(System.in);

        int tempoDownload;

        System.out.println("Informe o tamanho do arquivo em (MB): ");
        int mb = scanj.nextInt();
        System.out.println("Informe a velocidade da internet em (Mb/s): ");
        int mbps = scanj.nextInt();
        tempoDownload = mb / (mbps / 8);
        System.out.println("O tempo estimado para o fim do download é: " + (tempoDownload / 60) + " minuto(s)");

    }

}
