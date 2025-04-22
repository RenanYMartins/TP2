import java.util.List;

public class AdaptadorDeTexto extends EntendeTextoFormatado {
    public AdaptadorDeTexto(List<String> lista) {
        String textoAux="";
        for(String palavra:lista) {
            textoAux += (palavra+"@");
        }
        this.texto = textoAux.substring(0, textoAux.length()-1);
    }
}


