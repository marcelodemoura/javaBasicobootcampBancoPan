package javaBasico.javaBasic;

public class Operadores {
    public Operadores() {
    }

    public static void main(String[] args) {
        String nomeCompleto = "JAVA LINGUAGEM";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = "31";
        concatenacao = "1111";
        concatenacao = "1111";
        concatenacao = "1111";
        concatenacao = "13";
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero *= -1;
        System.out.println(numero);
        numero += 2;
        ++numero;
        System.out.println(numero);
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        int a = 9;
        int b = 6;
        String var10000 = a == b ? "Verdadeiro" : "Falso";
        String resultado;
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        System.out.println(resultado);
        int numero1 = 2;
        int numero2 = 4;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        simNao = numero1 < numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        simNao = numero1 <= numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        simNao = numero1 >= numero2;
        System.out.println("numeroUm é igual  a numeroDois? " + simNao);
        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("as duas duas condicões são verdadeiras");
        }

        if (!condicao1 && condicao2) {
        }

        System.out.println("uma das condicões são verdadeiras");
        System.out.println("fim");
    }
}
