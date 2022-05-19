package home.nathyelson.programacaobasicaJava.exerciciostopico8.figurageometrica;

public class TesteFiguraGeometrica {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(2);
        triangulo.setAltura(3);
        triangulo.setNome("Triângulo");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Círculo");

        Cubo cubo = new Cubo();
        cubo.setLado(2);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);
        cilindro.setNome("Cílindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setNumeroPoligonoBase(4);
        piramide.setBase(quadrado);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNome("Pirâmide");

        FiguraGeometrica[] figuraGeometricas = new FiguraGeometrica[6];

        figuraGeometricas[0] = quadrado;
        figuraGeometricas[1] = triangulo;
        figuraGeometricas[2] = circulo;
        figuraGeometricas[3] = cubo;
        figuraGeometricas[4] = cilindro;
        figuraGeometricas[5] = piramide;

        for (FiguraGeometrica figuras : figuraGeometricas) {

            System.out.println("__________________________");
            System.out.println(figuras.getNome());

            if (figuras instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figuras;
               // System.out.println(figura2D.calcularArea());

                figura2D.imprimirArea();

            }
            if (figuras instanceof Figura3D) {
                Figura3D figura3D = (Figura3D) figuras;
                //System.out.println(figura3D.calcularArea());
                //System.out.println(figura3D.calcularVolume());

                figura3D.imprimirArea();


            }


        }

    }

}
