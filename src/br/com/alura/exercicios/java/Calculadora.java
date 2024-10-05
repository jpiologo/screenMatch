package br.com.alura.exercicios.java;

public class Calculadora {
    int resultadoCalculo = 0;

    void multiplicaNumero(int valor) {
        resultadoCalculo = valor * 2;
    }

    int imprimeCalculo() {
        return resultadoCalculo;
    }
}
