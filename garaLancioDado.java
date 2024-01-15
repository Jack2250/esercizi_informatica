import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Creazione di un oggetto Random per generare numeri casuali
        Random random = new Random();

        // Lancio del dado per il giocatore 1
        int lancioGiocatore1 = lancioDado(random);

        // Lancio del dado per il giocatore 2
        int lancioGiocatore2 = lancioDado(random);

        // Stampa dei risultati dei lanci
        System.out.println("Giocatore 1 ha lanciato il dado e ha ottenuto: " + lancioGiocatore1);
        System.out.println("Giocatore 2 ha lanciato il dado e ha ottenuto: " + lancioGiocatore2);

        //vincitore o parità
        if (lancioGiocatore1 > lancioGiocatore2) {
            System.out.println("Giocatore 1 vince!");
        } else if (lancioGiocatore1 < lancioGiocatore2) {
            System.out.println("Giocatore 2 vince!");
        } else {
            System.out.println("È una parità!");
        }
    }

    // Metodo per il lancio del dado
    private static int lancioDado(Random random) {
        // Genera un numero casuale tra 1 e 6 (facce di un dado)
        return random.nextInt(6) + 1;
    }
}
