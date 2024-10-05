import br.com.alura.screenmatch.modelos.Movie;

public class MainMovies {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
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
    }
}