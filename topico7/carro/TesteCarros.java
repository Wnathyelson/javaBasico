package home.nathyelson.programacaobasicaJava.topico7.carro;

public class TesteCarros {

    public static void main(String[] args) {

        Carro caminhonete = new Carro();

        caminhonete.marca = "Toyota";
        caminhonete.modelo = "Hilux";
        caminhonete.cor = "Cinza metálico";
        caminhonete.quantidadePassageiros = 5;
        caminhonete.capacidadeCombustivel = 90;
        caminhonete.consumoDeCombustivel = 0.1;

        System.out.println("Marca: " + caminhonete.marca + "\n" +
                "Modelo: " + caminhonete.modelo + "\n" +
                "Cor: " + caminhonete.cor + "\n" +
                "Quantidade de passageiros: " + caminhonete.quantidadePassageiros + " pessoas" + "\n" +
                "Capacidade de combustível: " + caminhonete.capacidadeCombustivel + " litros" + "\n" +
                "Consumo de combustível: " + caminhonete.consumoDeCombustivel + " litros" + "\n");

        caminhonete.exibirAutonomia();

        double autonomia = caminhonete.obterAutonomia();

        System.out.println("A autonomia desse carro é de: " + autonomia + " Km/litro");

        System.out.println("A autonomia desse carro é de: " + caminhonete.obterAutonomia() + " Km/litro");

        System.out.println("A quantidade de combustível gasta é de: " +
                caminhonete.obterQuantidadeCombustivel(10) + " litros");

    }

}

