public class No {
    No proximo;

    public No(No no) {
        proximo = no;
    }

    public String executar(String texto) {
        String[] textos = texto.split("@");
        String textoFinal = "";
        for (String txt : textos) {
            if (proximo != null) {
                textoFinal += proximo.executar(txt);
            } else {
                textoFinal += txt;
            }
        }
        return textoFinal;
    }
}
