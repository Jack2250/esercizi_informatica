import java.util.Scanner;

import static Tools.Utility.*;

public class Main {
    public static void main(String[] args) {
        int contacontatti = 0;
        final int nContratti = 3;
        boolean uscita = false;
        Scanner tastiera = new Scanner(System.in);
        Persona[] gestore = new Persona[nContratti];
        String[] opzioni = {"Gestore telefonico", "1-Inserimento", "2-Visualizza", "3-Ricerca", "4-Modifica", "5- Cancella", "6-Telefonate", "7-Ricarica", "8-Fine"};

        do {
            switch (menu(opzioni, tastiera)) {
                case 1:
                    if (contacontatti < nContratti) {
                        Persona NuovoContatto = LeggiContatto(true, tastiera);
                        if (!Presente(gestore, NuovoContatto, contacontatti)) {
                            gestore[contacontatti] = NuovoContatto;
                            contacontatti++;
                        } else {
                            System.out.println("Il contatto è già presente nella collezione.");
                        }
                    } else {
                        System.out.println("Non ci sono più contratti da vendere");
                    }
                    break;

                case 2:
                    if (contacontatti > 0) {
                        Visualizza(gestore, contacontatti);
                    } else {
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    break;

                case 3:
                    if (contacontatti > 0) {
                        Persona Supporto = LeggiContatto(false, tastiera);
                        if (Presente(gestore, Supporto, contacontatti)) {
                            System.out.println("e' presente");
                        } else {
                            System.out.println("Non e' presente");
                        }
                    } else {
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    break;

                case 4:
                    if (contacontatti > 0) {
                        Persona Supporto = LeggiContatto(false, tastiera);
                        int posizione = posNumero(gestore, Supporto, contacontatti);
                        if (posizione != -1) {
                            System.out.println("Inserisci il numero di telefono");
                            gestore[posizione].numDiTelefono = tastiera.nextLine();
                        } else {
                            System.out.println("Non C( presente");
                        }
                    } else {
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    break;

                case 5:
                    if (contacontatti > 0) {
                        Persona Supporto = LeggiContatto(false, tastiera);
                        int posizione = posNumero(gestore, Supporto, contacontatti);
                        if (posizione != -1) {
                        } else {
                            System.out.println("Non C( presente");
                        }
                    } else {
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    break;

                case 6:
                    gestisciTelefonate(gestore, contacontatti, tastiera);
                    break;

                case 7:
                    gestisciRicariche(gestore, contacontatti, tastiera);
                    break;

                case 8:
                    uscita = true;
                    break;
            }
        }
        while (!uscita);
        System.out.println("Fine programma");
    }

    public static Persona LeggiContatto(boolean telSi, Scanner tastiera) {

        Persona contatto = new Persona();
        System.out.println("Inserici il nome");
        contatto.nome = tastiera.nextLine();
        System.out.println("Inserici il cognome");
        contatto.cognome = tastiera.nextLine();
        if (telSi) {
            System.out.println("Inserici il numero di telefono");
            contatto.numDiTelefono = tastiera.nextLine();
            String[] opzioni = {"TipoAbbonamento", "1-cellulare", "2-abitazione", "3-azienda"};
            int scelta;

            do {
                scelta = menu(opzioni, tastiera);
                switch (scelta) {
                    case 1 -> contatto.tipo = Tipologia.cellulare;

                    case 2 -> contatto.tipo = Tipologia.abitazione;

                    case 3 -> contatto.tipo = Tipologia.azienda;
                }
            }
            while (scelta > 3 || scelta < 1);
        }
        return contatto;
    }

    public static void Visualizza(Persona gestore[], int contacontatti) {
        for (int i = 0; i < contacontatti; i++) {
            System.out.println(gestore[i].anagrafica());
        }
    }

    public static boolean Presente(Persona[] gestore, Persona NuovoContatto, int contacontatti) {

        for (int i = 0; i < contacontatti; i++) {
            if ((gestore[i].nome.equals(NuovoContatto.nome)) && (gestore[i].cognome.equals(NuovoContatto.cognome))) {
                return true;
            }
        }
        return false;
    }

    public static int posNumero(Persona[] gestore, Persona NuovoContatto, int contacontatti) {
        for (int i = 0; i < contacontatti; i++) {
            if ((gestore[i].nome.equals(NuovoContatto.nome)) && (gestore[i].cognome.equals(NuovoContatto.cognome))) {
                return i;
            }
        }
        return -1;
    }

    public static int cancellaContatto(Persona[] gestore, int posizione, int contacontatti) {
        if (posizione != gestore.length) {
            for (int i = posizione; i < contacontatti - 1; i++)
                gestore[i] = gestore[i + 1];
        }
        return --contacontatti;
    }


    // Metodo per gestire le telefonate
    public static void gestisciTelefonate(Persona[] gestore, int contacontatti, Scanner tastiera) {

        if (contacontatti > 0) {
            Persona persona = selezionaContatto(gestore, contacontatti, tastiera);
            if (persona != null) {
                System.out.println("Inserisci la durata della telefonata in minuti:");
                int durata = tastiera.nextInt();
                tastiera.nextLine();
                double costo = calcolaCostoTelefonata(durata);
                persona.saldoTelefonico -= costo;
                System.out.println("La telefonata è costata " + costo + " $");
            } else {
                System.out.println("Contatto non trovato.");
            }
        } else {
            System.out.println("Non ci sono contatti disponibili.");
        }
    }

    // Metodo per gestire le ricariche
    public static void gestisciRicariche(Persona[] gestore, int contacontatti, Scanner tastiera) {

        if (contacontatti > 0) {
            Persona persona = selezionaContatto(gestore, contacontatti, tastiera);
            if (persona != null) {
                System.out.println("Inserisci l'importo della ricarica:");
                double importo = tastiera.nextDouble();
                tastiera.nextLine();
                persona.saldoTelefonico += importo;
                System.out.println("Ricarica effettuata con successo.");
            } else {
                System.out.println("Contatto non trovato.");
            }
        } else {
            System.out.println("Non ci sono contatti disponibili.");
        }
    }

    // Metodo per selezionare un contatto
    public static Persona selezionaContatto(Persona[] gestore, int contacontatti, Scanner tastiera) {
        System.out.println("Inserisci il nome del contatto:");
        String nome = tastiera.nextLine();
        System.out.println("Inserisci il cognome del contatto:");
        String cognome = tastiera.nextLine();
        for (int i = 0; i < contacontatti; i++) {
            if (gestore[i].nome.equalsIgnoreCase(nome)
                    && gestore[i].cognome.equalsIgnoreCase(cognome)) {
                return gestore[i];
            }
        }
        return null;
    }

    // Metodo per calcolare il costo di una telefonata
    public static double calcolaCostoTelefonata(int durata) {
        // Supponiamo che il costo sia 0.1  al minuto
        return durata * 0.50;
    }
}