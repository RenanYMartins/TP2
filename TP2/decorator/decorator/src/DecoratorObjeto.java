public class DecoratorObjeto implements Objeto {
    private Objeto objeto;

    public DecoratorObjeto(Objeto objeto) {this.objeto = objeto;}

    public String metodo() {
        return objeto.metodo() + " World";
    }
}