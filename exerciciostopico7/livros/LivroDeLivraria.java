package home.nathyelson.programacaobasicaJava.exerciciostopico7.livros;

public class LivroDeLivraria {

    public static void main(String[] args) {

        Livro mitologiaGrega = new Livro();

        mitologiaGrega.nomeLivro = "Percy Jackson, o mar de monstros";
        mitologiaGrega.nomeAutor = "Rick Riordan";
        mitologiaGrega.idiomaEscrito = "Português";
        mitologiaGrega.dataLancamento = "01/04/2006";
        mitologiaGrega.quantidadePaginas = 304;
        mitologiaGrega.preco = 24.90f;

        System.out.println("Informações sobre este livro: \n" +
                "Nome do livro: " + mitologiaGrega.nomeLivro + "\n" +
                "Nome do autor: " + mitologiaGrega.nomeAutor + "\n" +
                "Idioma escrito: " + mitologiaGrega.idiomaEscrito + "\n" +
                "Ano de lançamento: " + mitologiaGrega.dataLancamento + "\n" +
                "Quantidade de páginas: " + mitologiaGrega.quantidadePaginas + "\n" +
                "Valor do livro: " + mitologiaGrega.preco + "\n");

    }

}
