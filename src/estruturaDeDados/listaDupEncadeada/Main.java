package estruturaDeDados.listaDupEncadeada;
public class Main {
    public static void main(String[] args) {
        ListaDupEncadeada<String> minhaListaEncadeada = new ListaDupEncadeada();
        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");
        System.out.println(minhaListaEncadeada);
        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "99");
        System.out.println(minhaListaEncadeada);
        System.out.println((String)minhaListaEncadeada.get(3));
    }
}
