package home.nathyelson.programacaobasicaJava.topico8.interfaces;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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
