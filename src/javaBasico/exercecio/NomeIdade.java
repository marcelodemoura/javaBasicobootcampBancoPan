package javaBasico.exercecio;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args, int i) {
        Scanner scan = new Scanner(System.in);
        boolean idade = true;

        String nome;
        do {
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Idade: ");
        } while(!nome.equals("0"));

        System.out.println("Continua aqui...");
    }
}
