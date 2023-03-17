package javaBasico.javaBasic;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public AboutMe() {
    }

    public static void main(String[] args) {
        Scanner s = (new Scanner(System.in)).useLocale(Locale.US);
        System.out.println("Digite seu nome");
        String nome = s.next();
        System.out.println("Digite seu sobrenome ");
        String sobrenome = s.next();
        System.out.println("Digite sua idade ");
        int idade = s.nextInt();
        System.out.println("Digite sua altura ");
        double altura = s.nextDouble();
        System.out.println("Olá me chamo " + nome + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("minha altura é " + altura + "cm");
    }
}
