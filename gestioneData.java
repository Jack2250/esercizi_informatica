import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci la data nel formato ggmmaaaa: ");
            int data = scanner.nextInt();
            
            int giorno = data / 1000000; // Estrae i primi due cifre come giorno
            int mese = (data / 10000) % 100; // Estrae il mese 
            int anno = data % 10000; // Estrae l'anno
            
            boolean dataValida = verificaData(giorno, mese, anno);
            
            if (dataValida) {
                System.out.println("Data inserita corretta:");
                System.out.println("Giorno: " + giorno);
                System.out.println("Mese: " + convertiMeseStringa(mese));
                System.out.println("Anno: " + anno);
            } else {
                System.out.println("Data inserita non valida. Riprova.");
            }
            
            System.out.print("Vuoi inserire un'altra data? (sì/no): ");
            String risposta = scanner.next();
        }

        scanner.close();
    }

    // Metodo per convertire il numero del mese in una stringa
    public static String convertiMeseStringa(int mese) {
        String[] mesi = {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO",
                         "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"};
        return mesi[mese - 1];
    }

    // Metodo per verificare se una data è valida
    private static boolean verificaData(int giorno, int mese, int anno) {
        // Controllo se il mese è compreso tra 1 e 12
        if (mese < 1 || mese > 12)
            return false;
        
        // Controllo del numero di giorni per il mese
        int giorniInMese = giorniInMese(mese, anno);
        if (giorno < 1 || giorno > giorniInMese)
            return false;
        
        return true;
    }

    // Metodo per ottenere il numero di giorni in un mese specifico
private static int giorniInMese(int mese, int anno) {
    int giorni;
    switch (mese) {
        case 4:
        case 6:
        case 9:
        case 11:
            giorni = 30;
            break;
        case 2:
            if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0)
                giorni = 29;
            else
                giorni = 28;
            break;
        default:
            giorni = 31;
            break;
    }
    return giorni;
}

}
