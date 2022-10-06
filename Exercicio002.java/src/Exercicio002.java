import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) throws Exception {

        double saldo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu saldo: ");
        saldo = teclado.nextDouble();

        System.out.println("Saldo original sem reajuste: R$ " + saldo);
        teclado.close();
        System.out.println("Saldo reajustado: R$ " + (saldo*1.01));
    }
}
