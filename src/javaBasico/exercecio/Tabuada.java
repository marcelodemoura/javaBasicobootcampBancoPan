package javaBasico.exercecio;

import java.util.Scanner;

public class Tabuada {
    public Tabuada() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada" + tabuada);

        for(int numero = 1; numero <= 10; ++numero) {
            System.out.println("" + tabuada + " x " + numero + " = " + tabuada * numero);
        }

    }
}
