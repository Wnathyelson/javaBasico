package home.nathyelson.programacaobasicaJava.topico8.interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;
    private int tamanho;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }

    @Override
    public void amamentar() {

    }
}
