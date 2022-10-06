public class Exercicio001 {
    public static void main(String[] args) throws Exception {
         int [] numeros = new int[3];  
        numeros[0] = 4;
        numeros[1] = 5;
        numeros[2] = 6;

        int media1 = 0;
        for(int i = 0;i<numeros.length;i++)
        media1 += numeros[i];

        float total = (float)media1/numeros.length;

        System.out.println("Média Final: " + total);

    }
}
