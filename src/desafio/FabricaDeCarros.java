package desafio;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {

    }
        Scanner scan;
        int custoFabrica;
        int porcentagemDistribuidor;
        int PercentualImpostos;
        int custoConsumidor;
        int Distribuidor;
        int ValorImpostos;

        public FabricaDeCarros() {
            this.scan = new Scanner(System.in);
            this.custoFabrica = this.scan.nextInt();
            this.porcentagemDistribuidor = this.scan.nextInt();
            this.PercentualImpostos = this.scan.nextInt();
        }

}
