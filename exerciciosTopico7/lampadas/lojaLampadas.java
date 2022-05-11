package home.nathyelson.programacaoBasicaJava.exerciciosTopico7.lampadas;

public class lojaLampadas {

    public static void main(String[] args) {

        Lampadas lampadaLed = new Lampadas();

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
