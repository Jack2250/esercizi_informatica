import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        // Input degli interi nell'array
        System.out.print("Inserisci la lunghezza dell'array: ");
        int length = tastiera.nextInt();
        int[] arrayB = new int[length];
        int[] arrayS = new int[length];
        int contB = 0;

        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < length; i++) {
            arrayB[i] = tastiera.nextInt();
            arrayS[i] = arrayB[i];
        }

        boolean scambio;
        do {
            scambio = false;
            for (int i = 0; i < length - 1; i++) {

                if (arrayB[i] > arrayB[i + 1]) {
                    int temp = arrayB[i];
                    arrayB[i] = arrayB[i + 1];
                    arrayB[i + 1] = temp;
                    scambio = true;
                    contB++;
                }

                if (arrayB[i] > arrayB[i + 1]) {
                    int temp = arrayB[i];
                    arrayB[i] = arrayB[i + 1];
                    arrayB[i + 1] = temp;
                    scambio = true;
                    contB++;
                }

                if (arrayB[i] > arrayB[i + 1]) {
                    int temp = arrayB[i];
                    arrayB[i] = arrayB[i + 1];
                    arrayB[i + 1] = temp;
                    scambio = true;
                    contB++;
                }
            }
        } while (scambio);
        System.out.println("array ordinato con bubble sort");
        for (int i = 0; i < length; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("Operazioni svolte con bubble sort: " + contB);

    }
}
