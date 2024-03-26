//Enumeratori

import java.util.Scanner;

enum Fiori {
    rose, margherite, ciclamini;
}

public class Main {
    public static void main(String[] args) {
        Fiori tFiore = Fiori.rose;
        String[] opzioni = {"fiori", "[1] rosa", "[2] margherite", "[3] ciclamini"};
        Scanner tastiera = new Scanner(System.in);
        boolean fine = true;
        do {
            switch (menu(opzioni, tastiera)) {
                case 1:
                    tFiore = Fiori.rose;
                    fine = true;
                    break;
                case 2:
                    tFiore = Fiori.margherite;
                    fine = true;
                    break;
                case 3:
                    tFiore = Fiori.ciclamini;
                    fine = true;
                    break;
            }
            Wait(2000);
        } while (!fine);
        System.out.println(tFiore);
        //Conversione stringa enumeratore
        try {
            tFiore = Fiori.valueOf("rose");
            System.out.println(tFiore);

        } catch (Exception e) {
            System.out.println("Assegnazione Errata" + e.toString());

        }
        //conversione da enumeratore a intero
        int valore = tFiore.ordinal();
        System.out.println(valore);

        for (Fiori f : Fiori.values()) {
            System.out.println(f.name() + f.ordinal());
        }
        //conversione enumeratore in vettore
        Fiori[] f1 = Fiori.values();
        System.out.println(f1.length);

        //Conversione da intero a enumeratore
        tFiore = f1[valore];
        System.out.println(tFiore);
    }

    private static int menu(String[] opzioni, Scanner tastiera) {
        int scelta;
        do {
            ClrScr();
            System.out.println("----" + opzioni[0] + "----");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            System.out.println("------------");
            scelta = tastiera.nextInt();
            if (!(scelta >= 1 && scelta <= opzioni.length)) {
                System.out.println("Scelta errata");
                Wait(1000);
            }
            Wait(1000);
        } while (!(scelta >= 1 && scelta <= opzioni.length));
        return scelta;
    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
