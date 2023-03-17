package desafio;

import java.util.Scanner;

public class SomaHComNTermos {

    public SomaHComNTermos() {
    }

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        double h = 0.0;
        double n = sc.nextDouble();

        int i;
        for (i = 1; (double) i <= n; ++i) {
            if (i < 1) {
                h = 1.0;
            } else {
                h += 1.0 / (double) i;
            }
        }

        i = (int) Math.round(h);
        System.out.println(i);

    }

}
