package estruturaDeDados.equalsHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No("Conteudo nó1 ");
        No<String> no2 = new No("Conteudo nó2 ");
        no1.setProximoNo(no2);
        No<String> no3 = new No("Conteudo nó3 ");
        no2.setProximoNo(no3);
        No<String> no4 = new No("Conteudo nó4 ");
        no3.setProximoNo(no4);
        List<Carro> listaCarros = new ArrayList();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Volks"));
        listaCarros.add(new Carro("Chevrollet"));
        listaCarros.add(new Carro("Honda"));
        listaCarros.add(new Carro("Toyota"));
        System.out.println(listaCarros.contains(new Carro("Ford")));
    }
}
