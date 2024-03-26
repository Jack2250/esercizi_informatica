import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fiammiferi = 21;
        boolean giocatore1Turno = true;
        
        while (fiammiferi > 0) {
            System.out.println("Fiammiferi rimasti: " + fiammiferi);

            String giocatore;
            if (giocatore1Turno) {
                giocatore = "Giocatore 1";
            } else {
                giocatore = "Giocatore 2";
            }
            System.out.println(giocatore + ", è il tuo turno. Quanti fiammiferi vuoi togliere? (1-3)");

            int fiammiferiDaPrendere = scanner.nextInt();

            while (fiammiferiDaPrendere < 1 || fiammiferiDaPrendere > 3 || fiammiferiDaPrendere > fiammiferi) {
                System.out.println("Numero di fiammiferi non valido. Inserisci un numero valido tra 1 e 3 e che non superi il numero di fiammiferi rimasti.");
                fiammiferiDaPrendere = scanner.nextInt();
            }

            fiammiferi -= fiammiferiDaPrendere;

            giocatore1Turno = !giocatore1Turno;
        }

        String vincitore;
        if (giocatore1Turno) {
            vincitore = "Giocatore 2";
        } else {
            vincitore = "Giocatore 1";
        }
        System.out.println(vincitore + " Hai vinto!");
        
    }
}
