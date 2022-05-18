package home.nathyelson.programacaobasicaJava.topico7.fatorialrecursivo;

public class FatorialRecursivo {

    public static int fatorial(int num) {
        System.out.println("Está sendo calculado o fatorial de: " + num);
        if (num == 0) {

            return 1;

        }

        int fatorial = num * fatorial(num - 1);
        System.out.println(" E o valor é: "+fatorial);
        return fatorial;

    }

}

// fatorial de 5 = 5*4*3*2*1 -> pilha: O ultimo prato que entrou é o primeiro que vou lavar.
