package home.nathyelson.programacaobasicaJava.carro2;

public class Carro2 {

    String marca;
    String modelo;
    String cor;
    int quantidadePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //as classes já possuem um construtor oculto e seria a mesma coisa que construir: Carro(){}.

    Carro2() {

        System.out.println("A classe Carro2 foi instanciada");

        quantidadePassageiros = 5;

    }

    Carro2(String marca, String modelo, String cor, int quantidadePassageiros, double capacidadeCombustivel,
           double consumoCombustivel){

        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadePassageiros = quantidadePassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;

    }

    void exibirAutonomia() {

        System.out.println("A autonomia desse carro é de: " + capacidadeCombustivel * consumoCombustivel +
                " Km/litro");

    }

    double obterAutonomia() {

        System.out.println("Autonomia do carro foi obitida!");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    double obterQuantidadeCombustivel(double km) {

        double calcularCombustível = km / consumoCombustivel;
        return calcularCombustível;

    }
}
