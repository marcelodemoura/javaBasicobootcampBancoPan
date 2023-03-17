package estruturaDeDados.listaCircular;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular();
        minhaListaCircular.add("c10");
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c8");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);
        System.out.println((String) minhaListaCircular.get(600000854));
        System.out.println((String) minhaListaCircular.get(1000000000));
    }
}
