package home.nathyelson.programacaobasicaJava.exerciciostopico7.lampada.lampadaencapsulada;

public class LampadaEncapsulada {


    private String tipoLuz;

    private String marca;

    private String cor;

    private String voltagem;

    private int potencia;

    private boolean ligada;

    public String getTipoLuz() {

        return this.tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {

        this.tipoLuz = tipoLuz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {

        setLigada(true);
    }

    public void desligar() {

        setLigada(false);

    }

    public void mostrarEstado() {

        if (isLigada()) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A Lâmpada está desligada");
        }
    }

    public void mudarEstado() {

        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }

    }
}

