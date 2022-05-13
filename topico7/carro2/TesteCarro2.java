package home.nathyelson.programacaobasicaJava.topico7.carro2;

public class TesteCarro2 {


    public static void main(String[] args) {

        Carro2 sedan = new Carro2();

        sedan.marca = "Volkswagem";
        sedan.modelo = "Voyage";
        sedan.cor = "Prata";
        sedan.quantidadePassageiros = 5;

        System.out.println(sedan.marca);
        System.out.println(sedan.modelo);
        System.out.println(sedan.cor);
        System.out.println(sedan.quantidadePassageiros);

        Carro2 executivo = new Carro2("Toyota", "SW4", "Branca", 6,
                70, 0.1);

        System.out.println(executivo.marca);
        System.out.println(executivo.modelo);
        System.out.println(executivo.cor);
        System.out.println(executivo.quantidadePassageiros);

        System.out.println("A autonomia desse carro é de: "+executivo.obterAutonomia()+" Km/litro");

    }
}
