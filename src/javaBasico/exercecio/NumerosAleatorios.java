package javaBasico.exercecio;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        int numero;
        for(int i = 0; i < numerosAleatorios.length; ++i) {
            numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        int[] var7 = numerosAleatorios;
        numero = numerosAleatorios.length;

        int var5;
//        int numero = 0;
        for(var5 = 0; var5 < numero; ++var5) {
            numero = var7[var5];
            System.out.print("" + numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        var7 = numerosAleatorios;
        numero = numerosAleatorios.length;

        for(var5 = 0; var5 < numero; ++var5) {
            numero = var7[var5];
            System.out.print(numero - 1 + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        var7 = numerosAleatorios;
        numero = numerosAleatorios.length;

        for(var5 = 0; var5 < numero; ++var5) {
            numero = var7[var5];
            System.out.print(numero + 1 + " ");
        }

    }
}
