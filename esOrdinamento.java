import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        // Input degli interi nell'array
        System.out.print("Inserisci la lunghezza dell'array: ");
        int length = tastiera.nextInt();
        int[] array = new int[length];
        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < length; i++) {
            array[i] = tastiera.nextInt();
        }

        // Bubble sort per ordinare l'array con numeri pari crescenti , numeri dispari crescenti
        boolean scambio;
        do {
            scambio = false;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] % 2 != 0 && array[i + 1] % 2 != 0) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        scambio = true;
                    }
                } else if (array[i] % 2 == 0 && array[i + 1] % 2 == 0) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        scambio = true;
                    }
                } else if (array[i] % 2 != 0 && array[i + 1] % 2 == 0) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    scambio = true;
                }
            }
        } while (scambio);

        // Rimozione dei duplicati
        int nuovaLunghezza = 1;
        for (int i = 1; i < length; i++) {
            if (array[i] != array[i - 1]) {
                array[nuovaLunghezza] = array[i];
                nuovaLunghezza++;
            }
        }

        // Output dell'array ordinato senza duplicati
        System.out.println("Array ordinato e senza duplicati (pari crescenti, dispari crescenti):");
        for (int i = 0; i < nuovaLunghezza; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
