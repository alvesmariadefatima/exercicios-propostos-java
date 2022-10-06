public class Exercicio001Continuacao {
    public static void main(String[] args) throws Exception {
        int numeros [] = new int[3];
        numeros[0] = 7;
        numeros[1] = 8;
        numeros[2] = 9;

        int media = 0;
        for(int i = 0; i < numeros.length; i++)
            media += numeros[i];

        float total = (float)media/numeros.length;

        System.out.println("Média total: " + total);
    }
}
