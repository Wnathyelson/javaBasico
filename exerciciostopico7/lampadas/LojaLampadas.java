package home.nathyelson.programacaobasicaJava.exerciciostopico7.lampadas;

public class LojaLampadas {

    public static void main(String[] args) {

        Lampada lampadaLed = new Lampada();

        lampadaLed.marca = "Philips";
        lampadaLed.tipoLuz = "LED";
        lampadaLed.cor = "Luz branca";
        lampadaLed.voltagem = "Bivolt";
        lampadaLed.potencia = 9;

        System.out.println("Descrição");
        System.out.println("Marca: " + lampadaLed.marca + "\n" +
                "Tipo de luz: " + lampadaLed.tipoLuz + "\n" +
                "Cor da Luz: " + lampadaLed.cor + "\n" +
                "Voltagem da lâmpada: " + lampadaLed.voltagem + "\n" +
                "Potência da lâmpada: " + lampadaLed.potencia);

    }
}
