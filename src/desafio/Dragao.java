package desafio;

import java.util.Scanner;

public class Dragao {

    public Dragao() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int casos = ler.nextInt();

        for (int i = 0; i < casos; ++i) {
            int poderDeLuta = ler.nextInt();
            if (poderDeLuta <= 8000) {
                System.out.println("inseto");
            } else {
                System.out.println("Mais de 8000!");

            }

        }
    }

}
