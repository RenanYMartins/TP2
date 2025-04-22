public class MostraTexto {
    EntendeTextoFormatado etf = null;

    public void setAdaptador(EntendeTextoFormatado etf) {
        this.etf = etf;
    }

    public void ImprimeTexto() {
        etf.ImprimeTextFormatado();
    }
}
