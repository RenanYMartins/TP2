public class EntendeTextoFormatado {
    String texto = "";

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void ImprimeTextFormatado() {
        String[] partes = texto.split("@");
        for(String s:partes) {
            System.out.println(s);
        }
    }
}