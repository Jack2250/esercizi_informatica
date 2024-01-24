import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] opzioni = {"Estrazioni lotto", "[1] Ruota venezia", "[2] visualizza", "[3] exit"};
        Scanner tastiera = new Scanner(System.in);
        boolean fine = true;

        do {
            switch (menu(opzioni, tastiera)) {
                case 1:
                    System.out.println("opzione 1");
                    int n, casuale;
                    Scanner scanner = new Scanner(System.in);
                    Random random = new Random();
                    System.out.println("Quanti numeri casuali vuoi generare?");
                    n = scanner.nextInt();

                    int[] vettore = caricaVettore(n);
                    for (int i = 0; i < vettore.length; i++) {
                        System.out.println(vettore[i]);
                    }
                    break;
                case 2:
                    System.out.println("opzione 2");


                    break;
                case 3:
                    System.out.println("exit");
                    fine = false;
                    break;
                default:
                    System.out.println("opzione errata");
                    fine = false;
                    break;

            }
            Wait();

        } while (fine);

    }

    private static int menu(String[] opzioni, Scanner kyb) {
        int scelta;
        do {
            ClrScr();

            System.out.println("----" + opzioni[0] + "----");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);

            }
            System.out.println("------------");
            scelta = kyb.nextInt();
            if (!(scelta >= 1 && scelta <= opzioni.length)) {
                System.out.println("Scelta errata");
                Wait();

            }
            Wait();

        } while (!(scelta >= 1 && scelta <= opzioni.length));
        
        return scelta;
    }

    public static int[] caricaVettore(int n) {
        Random random = new Random();
        int casuale;
        int[] vettore = new int[n];
        for (int i = 0; i < n; i++) {
            casuale = random.nextInt(1, 90);
            vettore[i] = casuale;
        }
        return vettore;
    }

    private static void visualizza(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + "=" + v[i]);
        }
    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
