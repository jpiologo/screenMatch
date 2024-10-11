import br.com.alura.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class MainMovies {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
        Serie gameOfThrones = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        //Filme Top Gun
        newMovie.setNome("Top Gun: Maverick");
        newMovie.setAnoDeLancamento(2022);
        newMovie.setIncluidoNoPlano(true);
        newMovie.setGenero("Ação");
        newMovie.setDuracaoEmMinutos(160);
        newMovie.showsTechnicalFile();
        newMovie.rateMovie(8.8);
        newMovie.rateMovie(8.1);
        newMovie.rateMovie(8.0);
        newMovie.rateMovie(8.5);
        System.out.println(newMovie.getMovieRatings());
        System.out.println(newMovie.getDuracaoEmMinutos());

        //Serie GOT
        gameOfThrones.setMinutosPorEpisodio(50);
        gameOfThrones.setEpisodiosPorTemporada(10);
        gameOfThrones.setTemporadas(8);
        System.out.println(gameOfThrones.getDuracaoEmMinutos());

        calculadora.incluiTempoParaAssistir(gameOfThrones);
        calculadora.incluiTempoParaAssistir(newMovie);

        System.out.println("Tempo total para assistir: " + calculadora.getTempoTotal());

    }
}