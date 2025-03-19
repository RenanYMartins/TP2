public abstract class Calculo {
    String nomeDoCalculo;

    public void setNomeDoCalculo(String nome) {
        nomeDoCalculo = nome;
    }

    public String getNomeDoCalculo() {
        return nomeDoCalculo;
    }

    public abstract int calcular(int a, int b);
}
