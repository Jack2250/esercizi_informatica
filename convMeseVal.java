import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del mese:");
        String inputMese = scanner.nextLine();

        int numeroMese = intToStrMese(inputMese);
        if (numeroMese != -1) {
            System.out.println("Il corrispondente valore numerico del mese " + inputMese + " è: " + numeroMese);
        } else {
            System.out.println("Il mese inserito non è valido.");
        }

        scanner.close();
    }

    public static int intToStrMese(String mese) {
        switch (mese.toUpperCase()) {
            case "GENNAIO":
                return 1;
            case "FEBBRAIO":
                return 2;
            case "MARZO":
                return 3;
            case "APRILE":
                return 4;
            case "MAGGIO":
                return 5;
            case "GIUGNO":
                return 6;
            case "LUGLIO":
                return 7;
            case "AGOSTO":
                return 8;
            case "SETTEMBRE":
                return 9;
            case "OTTOBRE":
                return 10;
            case "NOVEMBRE":
                return 11;
            case "DICEMBRE":
                return 12;
            default:
                return -1; // Valore non valido
        }
    }
}
