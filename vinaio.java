import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scelta;
        double barbera = 1.5;
        int lugana = 2;
        int merlot = 1;
        double iva = 0.21;
        int bottiglione = 0;
        double capacita = 1.5;
        float costolitro = 1;
        double litriAcquistati = bottiglione * capacita;
        double prezzoTotale = 0;
        double prezzoIva = prezzoTotale * iva;
        double prezzoTotaleConIva = prezzoTotale + prezzoIva;


        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Inserisci il numero di bottiglioni");
        bottiglione = keyBoard.nextInt();
        do {
            ClearScr();
            System.out.println("Numero bottiglioni non valido, reinserisci il numero di bottiglioni");
            bottiglione = keyBoard.nextInt();

        } while (bottiglione< 0);
        System.out.println("Hai acquistato " + bottiglione + "bottiglione/i");

        System.out.println
                ("Quale tipo di vino vuoi acquistare? 1 barbera, 2 lugana, 3 merlot");
        scelta = keyBoard.nextInt();
        if (scelta == 1) {


            System.out.println("Hai acquistato " + litriAcquistati + "litri");

            prezzoTotale = barbera * litriAcquistati;
            System.out.println("Hai speso " + prezzoTotale + "$");


            System.out.println("Prezzo di cui iva " + prezzoIva + "$");


            System.out.println("Prezzo totale con iva " + prezzoTotaleConIva +
                    "$");


        } else if (scelta == 2) {

            System.out.println("Hai acquistato " + litriAcquistati + "litri");

            prezzoTotale = lugana * litriAcquistati;
            System.out.println("Hai speso " + prezzoTotale + "$");


            System.out.println("Prezzo di cui iva " + prezzoIva + "$");


            System.out.println("Prezzo totale con iva " + prezzoTotaleConIva +
                    "$");

        } else if (scelta == 3) {

            System.out.println("Hai acquistato " + litriAcquistati + "litri");

            prezzoTotale = merlot * litriAcquistati;
            System.out.println("Hai speso " + prezzoTotale + "$");


            System.out.println("Prezzo di cui iva " + prezzoIva + "$");


            System.out.println("Prezzo totale con iva " + prezzoTotaleConIva +
                    "$");

        } else {
            System.out.println("Scelta non valida");
        }

    }

    static void ClearScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.out.println("errore" + e);
        }
    }
}
