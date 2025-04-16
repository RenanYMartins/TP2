import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        EntendeTextoFormatado etf = new EntendeTextoFormatado();

        etf.setTexto("joao@maria");
        etf.ImprimeTextFormatado();

        // adaptador
        List<String> lista = new ArrayList<String>();
        lista.add("Cristina");
        lista.add("jose");

        AdaptadorDeTexto adt = new AdaptadorDeTexto(lista);
        adt.ImprimeTextFormatado();

        MostraTexto mt = new MostraTexto();
        mt.setAdaptador(etf);
        mt.ImprimeTexto();
        mt.setAdaptador(adt);
        mt.ImprimeTexto();
    }
}
