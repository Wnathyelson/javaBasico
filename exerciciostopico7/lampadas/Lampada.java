package home.nathyelson.programacaobasicaJava.exerciciostopico7.lampadas;

public class Lampada {

    String tipoLuz;
    String marca;
    String cor;
    String voltagem;

    int potencia;

    boolean ligada;

    void ligarLampada() {

        ligada = true;

        System.out.println("Moveu o interruptor para cima!");
        System.out.println("A lâmpada está ligada!");

    }

    void desligarLampada() {

        ligada = false;

        System.out.println("Moveu o interruptor para baixo!");
        System.out.println("A lâmpada está desligada");

    }

}
