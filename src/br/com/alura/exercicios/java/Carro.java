package br.com.alura.exercicios.java;

public class Carro {
    private String modelo;
    private double preco;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void calculaPrecoPorAno(int ano) {
        if (ano > 2020) {
            preco = 50000;
        }
        else if (ano > 2010){
            preco = 30000;
        }
        else {
            preco = 20000;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
