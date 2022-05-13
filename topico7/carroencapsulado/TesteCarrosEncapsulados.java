package home.nathyelson.programacaobasicaJava.topico7.carroencapsulado;

public class TesteCarrosEncapsulados {

    public static void main(String[] args) {

        CarroEncapsulado carroCapsula = new CarroEncapsulado();

        carroCapsula.setMarca("Capsula");
        carroCapsula.setModelo("CC-00");
        carroCapsula.setCor("Branco");
        carroCapsula.setQuantidadePassageiros(6);
        carroCapsula.setConsumoCombustivel(0.1, 10);
        carroCapsula.setCapacidadeCombustivel(75);

        System.out.println("Especificações do carro: \n" +
                "Marca do carro: " + carroCapsula.getMarca() + "\n" +
                "Modelo do carro: " + carroCapsula.getModelo() + "\n" +
                "Cor do carro: " + carroCapsula.getCor() + "\n" +
                "Quantidade de passageiros: " + carroCapsula.getQuantidadePassageiros() + "\n" +
                "Capacidade de combustível: " + carroCapsula.getCapacidadeCombustivel() + " litros" + "\n" +
                "Consumo de combustivel: " + carroCapsula.getConsumoCombustivel() + " litros");

    }

}
