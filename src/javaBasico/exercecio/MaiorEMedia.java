package javaBasico.exercecio;

import java.util.Scanner;

public class MaiorEMedia {
    public MaiorEMedia() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int calculadora = 0;
        int maior = 0;
        int soma = 0;

        double media;
        do {
            System.out.println("Digite numero");
            int numero = scan.nextInt();
            soma += numero;
            media = (double) (soma / 5);
            if (numero > maior) {
                maior = numero;
            }

            ++calculadora;
        } while (calculadora < 5);

        System.out.println("Maior " + maior);
        System.out.println("Media " + media);
    }
}
