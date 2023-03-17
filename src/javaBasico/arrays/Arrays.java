package javaBasico.arrays;
public class Arrays {

    public static void main(String[] args) {
        int[] vetor = new int[]{-5, -6, 15, 50, 8, 4};
        System.out.print("Vetor: ");

        for(int calculadora = 0; calculadora < vetor.length; ++calculadora) {
            System.out.print(vetor[calculadora] + " ");
        }

        System.out.print("\nVetor: ");

        for(int i = vetor.length - 1; i >= 0; --i) {
            System.out.print(vetor[i] + " ");
        }

    }
}
