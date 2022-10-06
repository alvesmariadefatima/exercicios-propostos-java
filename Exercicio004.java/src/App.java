import.java.util.Scanner

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int antecessor, sucessor, numero;

        System.out.println("Digite o valor de um número qualquer: ");
        numero = entrada.nextInt();
        entrada.nextLine();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}
