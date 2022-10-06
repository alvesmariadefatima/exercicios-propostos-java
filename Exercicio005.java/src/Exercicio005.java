import java.util.Scanner;
    
    public static void main(String[] args) throws Exception {
        float altura;
        float massa;
        float imc;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = leitura.nextFloat();

        System.out.println("Digite sua massa: ");
        massa = leitura.nextFloat();

        imc = (72.7f*altura)-58; //Cálculo do IMC

        System.out.println("Seu peso ideal (IMC) é: " + imc);
    }
}
