package br.com.alura.exercicios.java;

public class MainCalculadora {
    public static void main(String[] args) {
//        br.com.alura.exercicios.java.Pessoa pessoa1 = new br.com.alura.exercicios.java.Pessoa();
//        pessoa1.returnHelloOnScreen();

        Calculadora calc = new Calculadora();
        calc.multiplicaNumero(9);
        System.out.println(calc.imprimeCalculo());
    }
}
