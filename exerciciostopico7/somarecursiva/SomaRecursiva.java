package home.nathyelson.programacaobasicaJava.exerciciostopico7.somarecursiva;

public class SomaRecursiva {

    public static int somarRecursivo(int n) {

        if (n == 1) {
            return 1;
        }

        return n + somarRecursivo(n - 1);

    }

}
