package javaBasico.operadores;

public class OperadoresLogicos {
    public OperadoresLogicos() {
    }

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));
        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));
        System.out.println("b2 ^ b3" + (b2 ^ b3));
        System.out.println("b2 ^ b4" + (b2 ^ b4));
        System.out.println(!b1);
        System.out.println(!b2);
        int i1 = 10;
        int i2 = 5;
        float f1 = 20.0F;
        float f2 = 50.0F;
        System.out.println("((i1 + i2 <(f2 - f1)) && true " + ((float)(i1 + i2) < f2 - f1));
        System.out.println("(i1 > i2) || (f2 < f1) " + (i1 > i2 || f2 < f1));
        double salarioMensal = 11983.58;
        double mediaSalario = 10500.0;
        int qauntidadeDepandente = 4;
        int mediaDependemtes = 2;
        System.out.println(salarioMensal < mediaSalario && qauntidadeDepandente >= mediaDependemtes);
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitoDependentes = qauntidadeDepandente >= mediaDependemtes;
        System.out.println(salarioBaixo && muitoDependentes);
        boolean receberAuxilio = salarioBaixo && muitoDependentes;
        System.out.println("Receber Auxilio " + receberAuxilio);
    }
}
