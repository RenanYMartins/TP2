public class ObjetoProxy implements Objeto {
    private static ObjetoPrincipal objeto;

    public void setObjeto(Objeto objeto) {this.objeto = (ObjetoPrincipal) objeto;}

    public String metodo() {
        if(objeto==null) objeto = new Objeto();

        return objeto.metodo();
    }
}