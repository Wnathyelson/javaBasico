package home.nathyelson.programacaobasicaJava.exerciciostopico7.lampada.lampadaencapsulada;

public class TesteLampadaEncapsulada {

    public static void main(String[] args) {

        LampadaEncapsulada lampadaCapsula = new LampadaEncapsulada();

        lampadaCapsula.setMarca("Capsula");
        lampadaCapsula.setCor("Vermelha");
        lampadaCapsula.setTipoLuz("LED");
        lampadaCapsula.setVoltagem("Bivolt");
        lampadaCapsula.setPotencia(9);

        System.out.println("Descrição: " + "\n" +
                "Marca da lâmpada: " + lampadaCapsula.getMarca() + "\n" +
                "Cor da lâmpada: " + lampadaCapsula.getCor() + "\n" +
                "Tipo de luz: " + lampadaCapsula.getTipoLuz() + "\n" +
                "Voltagem: " + lampadaCapsula.getVoltagem() + "\n" +
                "Potência: " + lampadaCapsula.getPotencia());

        lampadaCapsula.ligar();

        lampadaCapsula.mostrarEstado();

        lampadaCapsula.desligar();

        lampadaCapsula.mostrarEstado();

        lampadaCapsula.mudarEstado();

        lampadaCapsula.mostrarEstado();

    }

}
