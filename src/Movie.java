import java.util.Scanner;

public class Movie {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    String genero;
    int duracaoEmMinutos;

    void showsTechnicalFile() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void rateMovie() {
        Scanner scanner = new Scanner(System.in);
        double nota = scanner.nextDouble();
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double getMovieRatings() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
