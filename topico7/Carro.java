package home.nathyelson.programacaoBasicaJava.topico7;

public class Carro {


    String marca;
    String modelo;
    String cor;
    int quantidadePassageiros;
    double capacidadeCombustivel;
    double consumoDeCombustivel;

    void exibirAutonomia() {

        System.out.println("A autonomia desse carro é de: " + capacidadeCombustivel * consumoDeCombustivel +
                " Km/litro");

    }

    double obterAutonomia() {

        System.out.println("Autonomia do carro foi obitida!");

        return capacidadeCombustivel * consumoDeCombustivel;
    }

    double obterQuantidadeCombustivel(double km) {

        double calcularCombustível = km / consumoDeCombustivel;
        return calcularCombustível;

    }

}
