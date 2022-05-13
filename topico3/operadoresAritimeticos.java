package home.nathyelson.programacaobasicaJava.topico3;

public class operadoresAritimeticos {

     public static void main(String [] args){

               int n1 = 2;
               int n2 = 3;
               int resultado;

               resultado = n1+n2;

               System.out.println("Soma: "+resultado);

               resultado = resultado - 2;

               System.out.println("Subtração: "+resultado);

               resultado = resultado * 3;

               System.out.println("Multiplicação: "+resultado);

               resultado = resultado / 2;

               System.out.println("Divisão: "+resultado);

               resultado = resultado % 3;

               System.out.println("Resto da divisão: "+resultado);

               String inicioFrase = "Hoje o dia está";
               String fimfrase = "lindo demais!";

               System.out.println("Concatenação de Strings: "+ inicioFrase+" "+fimfrase);

               resultado = resultado + 9; // Soma o resultado novamente +9;

               System.out.println(resultado++);// primeiro mostra o resultado e depois incrementa, imprime o resultado;

               System.out.println(++resultado);// primeiro incrementa e depois mostra o resultado,
               // imprime o resultado com o incremento;

               System.out.println(resultado--); // primeiro mostra o resultado e depois decrementa, imprime o resultado;

               System.out.println(--resultado);// primeiro decrementa e depois mostra o resultado,
               // imprime o resultado com decremento;








     }
}
