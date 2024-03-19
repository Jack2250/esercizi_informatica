import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int data;
        int[] dataGGMMAAAA;
        boolean dataError = false;
        do {
            System.out.println("Inserisci la data in GGMMAAAA o GMMAAAA");
            data = tastiera.nextInt();
            dataError = validataShort(data);
            if (!dataError)
                System.out.println("Formato data errato");
        } while (!dataError);
        System.out.println("Data corretta");

        dataGGMMAAAA = elementiData(data);
        System.out.println(dataGGMMAAAA[0]);
        System.out.println(dataGGMMAAAA[1]);
        System.out.println(dataGGMMAAAA[2]);

        System.out.println(dataString(dataGGMMAAAA));

        // Menù per aggiungere o togliere giorni
        int scelta;
        do {
            System.out.println("\nMenù:");
            System.out.println("1. Aggiungi giorni");
            System.out.println("2. Togli giorni");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = tastiera.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il numero di giorni da aggiungere: ");
                    int giorniAggiunti = tastiera.nextInt();
                    dataGGMMAAAA = data_up(dataGGMMAAAA, giorniAggiunti);
                    System.out.println("Nuova data: " + dataString(dataGGMMAAAA));
                    break;
                case 2:
                    System.out.print("Inserisci il numero di giorni da togliere: ");
                    int giorniTolti = tastiera.nextInt();
                    dataGGMMAAAA = data_down(dataGGMMAAAA, giorniTolte);
                    System.out.println("Nuova data: " + dataString(dataGGMMAAAA));
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        } while (scelta != 0);
    }

    public static boolean validaData(int data) {
        int lunghezza = 0;
        do {
            data = data / 10;
            lunghezza++;
        } while (data > 0);
        return (lunghezza == 7 || lunghezza == 8);
    }

    public static boolean validataShort(int data) {
        return !(data < 01010001 || data < 3112999);
    }

    public static int[] elementiData(int data) {
        int[] elementi = new int[3];
        elementi[0] = data % 10000; //12042004
        data = data / 10000;
        elementi[1] = data % 100;
        data = data / 100;
        elementi[2] = data;
        return elementi;
    }

    public static String dataString(int[] dataGGMMAAAA) {
        String meseS;
        meseS = switch (dataGGMMAAAA[1]) {
            case 1 -> " gennaio ";
            case 2 -> " Febbraio ";
            case 3 -> " Marzo ";
            case 4 -> " Aprile ";
            case 5 -> " Maggio ";
            case 6 -> " Giugno ";
            case 7 -> " Luglio ";
            case 8 -> " Agosto ";
            case 9 -> " Settembre ";
            case 10 -> " Ottobre ";
            case 11 -> " Novembre ";
            case 12 -> " Dicembre ";
            default -> " Errato ";
        };
        return dataGGMMAAAA[0] + meseS + dataGGMMAAAA[2];
    }


    public static int giorniMese(int mese, int anno) {
        // Restituisce il numero di giorni nel mese specificato
        int[] giorniPerMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Aggiustamento per gli anni bisestili
        if (mese == 2 && annoBisestile(anno)) {
            return 29;
        } else {
            return giorniPerMese[mese];
        }
    }

    public static boolean annoBisestile(int anno) {
        // Verifica se l'anno è bisestile
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }

    public static int[] data_up(int[] dataGGMMAAAA, int giorni) {
        // Calcola la nuova data aggiungendo giorni
        int anno = dataGGMMAAAA[2];
        int mese = dataGGMMAAAA[1];
        int giorno = dataGGMMAAAA[0];

        // Calcolo della nuova data
        giorno += giorni;

        // Controllo e aggiustamento se supera i giorni massimi del mese
        while (giorno > giorniMese(mese, anno)) {
            giorno -= giorniMese(mese, anno);
            mese++;
            if (mese > 12) {
                mese = 1;
                anno++;
            }
        }

        // Aggiornamento dell'array
        dataGGMMAAAA[0] = giorno;
        dataGGMMAAAA[1] = mese;
        dataGGMMAAAA[2] = anno;

        return dataGGMMAAAA;
    }
    
    public static int[] data_down(int[] dataGGMMAAAA, int giorni) {
        // Calcola la nuova data togliendo giorni
        int anno = dataGGMMAAAA[2];
        int mese = dataGGMMAAAA[1];
        int giorno = dataGGMMAAAA[0];

        // Calcolo della nuova data
        giorno -= giorni;

        // Controllo e aggiustamento se scende sotto 1
        while (giorno < 1) {
            mese--;
            if (mese < 1) {
                mese = 12;
                anno--;
            }
            giorno += giorniMese(mese, anno);
        }

        // Aggiornamento dell'array
        dataGGMMAAAA[0] = giorno;
        dataGGMMAAAA[1] = mese;
        dataGGMMAAAA[2] = anno;

        return dataGGMMAAAA;
    }
}
