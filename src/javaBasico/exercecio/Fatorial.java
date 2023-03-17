package javaBasico.exercecio;

import java.util.Scanner;

public class Fatorial {
    public Fatorial() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial:");
        int fatorial = scan.nextInt();
        int multip = 1;
        System.out.print("" + fatorial + "! = ");

        for(int i = fatorial; i >= 1; --i) {
            multip *= i;
        }

        System.out.println(multip);
    }
}
