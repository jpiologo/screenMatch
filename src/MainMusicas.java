public class MainMusicas {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "Caruso";
        musica1.artista = "Andrea Bocelli";
        musica1.anoLancamento = 2016;

        musica1.exibeFichaTecnica();
        musica1.recebeNotas(10.0);
        musica1.recebeNotas(9.0);
        musica1.recebeNotas(9.3);
        System.out.println(musica1.imprimeMediaNotas());
    }
}
