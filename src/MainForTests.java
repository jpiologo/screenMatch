public class MainForTests {
    public static void main(String[] args) {
//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.returnHelloOnScreen();

        Calculadora calc = new Calculadora();
        calc.multiplicaNumero(9);
        System.out.println(calc.imprimeCalculo());
    }
}
