import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int[] numeriEstratti = new int[5];

    public static void main(String[] args) {
        String[] opzioni = {"Estrazioni lotto", "[1] Ruota Venezia", "[2] Visualizza", "[3] Exit"};
        Scanner kyb = new Scanner(System.in);

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
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Scelta errata");
            }
        } while (scelta != 3);

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
                Wait(2000);
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

    private static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
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
}
