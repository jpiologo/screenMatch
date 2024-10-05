package br.com.alura.screenmatch.modelos;

public class Movie extends Titulo {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
}
