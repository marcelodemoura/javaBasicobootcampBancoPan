package estruturaDeDados.no;
public class Main {
    public static void main(String[] args) {
        Pilha minhaPlilha = new Pilha();
        minhaPlilha.push(new No(1));
        minhaPlilha.push(new No(2));
        minhaPlilha.push(new No(3));
        minhaPlilha.push(new No(4));
        minhaPlilha.push(new No(5));
        minhaPlilha.push(new No(6));
        System.out.println(minhaPlilha);
        System.out.println(minhaPlilha.pop());
        System.out.println(minhaPlilha);
    }
}
