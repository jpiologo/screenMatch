public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDeNotas;
    int numeroDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome da Musica: " + titulo);
        System.out.println("Artista: " + artista);
    }

    void recebeNotas(double nota) {
        somaDeNotas += nota;
        numeroDeAvaliacoes++;
    }

    double imprimeMediaNotas() {
        return somaDeNotas / numeroDeAvaliacoes;
    }

}
