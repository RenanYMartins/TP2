public class App {
    public static void main(String[] args) throws Exception {
        Somar somar = new Somar();
        somar.setNomeDoCalculo("somar");
        Subtrair subtrair = new Subtrair();
        subtrair.setNomeDoCalculo("subtrair");

        Calculadora calculadora = new Calculadora();
        calculadora.adicionarCalculo(somar);
        calculadora.adicionarCalculo(subtrair);

        double resultado1 = calculadora.calcular("somar", 10, 20);
        double resultado2 = calculadora.calcular("subtrair", 10, 20);

        System.err.println(resultado1);
        System.err.println(resultado2);
    }
}
