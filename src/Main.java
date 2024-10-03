public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
        newMovie.nome = "Top Gun: Maverick";
        newMovie.anoDeLancamento = 2022;
        newMovie.incluidoNoPlano = true;
        newMovie.genero = "Ação";
        newMovie.duracaoEmMinutos = 160;

        newMovie.showsTechnicalFile();
        newMovie.rateMovie();
        newMovie.getMovieRatings();
    }
}
