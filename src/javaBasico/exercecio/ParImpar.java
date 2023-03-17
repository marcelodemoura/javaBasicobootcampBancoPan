package javaBasico.exercecio;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int pares = 0;
        int impar = 0;
        System.out.println("Quantidade de Números");
        int Qnumeros = scan.nextInt();

        do {
            System.out.println("Números");
            int numeros = scan.nextInt();
            if (contador % 2 == 0) {
                ++pares;
            } else {
                ++impar;
            }

            ++contador;
        } while(contador < Qnumeros);

        System.out.println("Números Pares" + pares);
        System.out.println("Números Impares" + impar);
    }
}
