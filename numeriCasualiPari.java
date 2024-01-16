import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri casuali vuoi generare?");
        n = scanner.nextInt();

        int[] vettore = caricaVettore(n);
        int[] vettorePari = pari(vettore);

        System.out.println("Vettore originale:");
        stampaVettore(vettore);
        
        
        System.out.println("Vettore dei numeri pari:");
        stampaVettore(vettorePari);
    }

    public static int[] caricaVettore(int n) {
        Random random = new Random();
        int casuale;
        int[] vettore = new int[n];
        for (int i = 0; i < n; i++) {
            casuale = random.nextInt(101);
            vettore[i] = casuale;
        }
        return vettore;
    }

    public static int[] pari(int[] vettore) {
        int contPari = 0;
        for (int num : vettore) {
            if (num % 2 == 0) {
                contPari++;
            }
        }

        int[] vettorePari = new int[contPari];
        int index = 0;
        for (int num : vettore) {
            if (num % 2 == 0) {
                vettorePari[index++] = num;
            }
        }

        return vettorePari;
    }

    public static void stampaVettore(int[] vettore) {
        for (int num : vettore) {
            System.out.println(num);
        }
    }
}
