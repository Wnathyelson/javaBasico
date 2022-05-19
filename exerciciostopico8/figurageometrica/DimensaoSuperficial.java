package home.nathyelson.programacaobasicaJava.exerciciostopico8.figurageometrica;

public interface DimensaoSuperficial {

  double calcularArea();


 default void imprimirArea(){

     System.out.println(calcularArea());

 }

}
