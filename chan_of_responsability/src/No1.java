public class No1 extends No {
    public No1(No no) { super(no);}

    public String executar(String texto) {
        String[] textos = texto.split(";");
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
