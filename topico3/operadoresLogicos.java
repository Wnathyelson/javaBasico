package home.nathyelson.programacaobasicaJava.topico3;

public class operadoresLogicos {

    public static void main(String [] args){

            int valor1 = 1;
            int valor2 = 2;

            boolean resultado1 = (valor1 == 1) && (valor2 == 2);

            System.out.println("Valor 1 é 1 AND valor 2 é 2 - resultado: "+resultado1);

            boolean resultado2 = (valor1 == 1) || (valor2 == 2);

            System.out.println("Valor 1 é 1 OR valor 2 é 2 - resultado: "+resultado2);

            boolean verdadeiro = true;
            boolean falso = false;

            System.out.println(verdadeiro && falso);// AND: se os dois valores forem verdadeiros, o resultado é true;
                // se não sera false;
            System.out.println(verdadeiro || falso); // OR: se um valor for verdadeiro e o outro falso, o resultado é
                // true, só irá retonar false se os dois valores forem falsos;
            System.out.println(verdadeiro ^ falso);// XOR se os valores forem diferentes o resultado é true,
                // e quando iguais o resultado será false;
            System.out.println(!verdadeiro && falso); // NOT: o resultado sera diferente da expressão testada;
    }

}
