public class App {
    public static void main(String[] args) throws Exception {
        No1 cauda = new No1(null);
        No cabeca = new No(cauda);

        System.out.println(cabeca.executar("A;B@C;D@"));
    }
}
