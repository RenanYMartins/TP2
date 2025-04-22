public class App {
    public static void main(String[] args) throws Exception {
        Objeto objetoP = new ObjetoPrincipal();

        System.out.println(objetoP.metodo()); // Hello

        DecoratorObjeto obj = new DecoratorObjeto(objetoP);

        System.out.println(obj.metodo());

        DecoratorObjeto obj1 = new DecoratorObjeto(obj);

        System.out.println(obj1.metodo()); // Hellow World World
    }
}
