package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private String genero;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getMovieRatings() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void showsTechnicalFile() {
        System.out.println("Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void rateMovie(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }


}
