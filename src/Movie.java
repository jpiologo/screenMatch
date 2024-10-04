import java.util.Scanner;

public class Movie {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    String genero;
    int duracaoEmMinutos;

    void showsTechnicalFile() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void rateMovie(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double getMovieRatings() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
