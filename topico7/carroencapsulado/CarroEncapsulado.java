package home.nathyelson.programacaobasicaJava.topico7.carroencapsulado;

public class CarroEncapsulado {

    private String marca;
    private String modelo;
    private String cor;
    private int quantidadePassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public double getCapacidadeCombustivel() {

        return this.capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {

        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {

        return this.consumoCombustivel;

    }

    public void setConsumoCombustivel(double consumoCombustivel, double km) {
        this.consumoCombustivel = km / consumoCombustivel;

    }

}


