import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final int[] numeriEstratti = new int[5];

    public static void main(String[] args) {
        String[] opzioni = {"Estrazioni lotto", "[1] Ruota Venezia", "[2] Visualizza ruota Venezia", "[3] 5 numeri giocati dall'utente senza ripetizioni", "[4] Verifica vincita", "[5] Exit"};
        Scanner kyb = new Scanner(System.in);
        Scanner tastiera = new Scanner(System.in);
        int numeri;
        int[] vetNumeri = new int[0];

        int scelta;
        do {
            scelta = mnu(opzioni, kyb);

            switch (scelta) {
                case 1:
                    estraiNumeriVenezia();
                    break;
                case 2:
                    visualizzaNumeriEstratti();
                    break;
                case 3:
                    System.out.println("Inserisci il " + 1 + " numero");
                    numeri = tastiera.nextInt();
                    vetNumeri[1] = numeri;
                    System.out.println("Inserisci il " + 2 + " numero");
                    numeri = tastiera.nextInt();
                    vetNumeri[2] = numeri;
                    System.out.println("Inserisci il " + 3 + " numero");
                    numeri = tastiera.nextInt();
                    vetNumeri[3] = numeri;
                    System.out.println("Inserisci il " + 4 + " numero");
                    numeri = tastiera.nextInt();
                    vetNumeri[4] = numeri;
                    System.out.println("Inserisci il " + 5 + " numero");
                    numeri = tastiera.nextInt();
                    vetNumeri[5] = numeri;

                    break;

                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            i = numeriEstratti[i];
                            j = vetNumeri[i];
                            if (i == j) {
                                System.out.println("ambo");
                            }

                        }
                    }
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Scelta errata");
            }
        } while (scelta != 5);

    }

    private static int mnu(String[] opzioni, Scanner kyb) {
        int scelta;
        do {
            ClrScr();
            System.out.println("-----" + opzioni[0] + "-----");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            System.out.println("----------------");
            scelta = kyb.nextInt();
            if (!(scelta >= 1 && scelta < opzioni.length)) {
                System.out.println("Scelta errata");
                Wait();
            }
        } while (!(scelta >= 1 && scelta < opzioni.length));
        return scelta;
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

    private static void estraiNumeriVenezia() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            numeriEstratti[i] = rand.nextInt(90) + 1;
        }
        System.out.println();
    }

    private static void visualizzaNumeriEstratti() {
        System.out.println("Numeri estratti precedentemente:");
        for (int i = 0; i < numeriEstratti.length; i++) {
            System.out.print(numeriEstratti[i] + " ");
        }
        System.out.println();
    }

    private static void visualizza(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + "=" + v[i]);
        }
    }

}
