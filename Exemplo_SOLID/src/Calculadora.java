import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Calculo> calculos = new ArrayList<>();

    public void adicionarCalculo(Calculo calculo) {
        calculos.add(calculo);
    }

    public double calcular(String nome, int a, int b) {
        for (Calculo calculo : calculos) {
            if (calculo.getNomeDoCalculo().equals(nome))
                return calculo.calcular(a, b);
        }
        return 0;
    }
}
