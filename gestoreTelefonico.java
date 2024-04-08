import java.util.Scanner;
import static Tools.Utility.*;
//* = utilizza tutto quello che trovi nella classe

public class Main {
    public static void main(String[] args) {
        final int nContratti = 3;
        Scanner tastiera = new Scanner(System.in);
        Persona[] gestore = new Persona[nContratti];
        String[] opzioni = {"Gestore Telefonico" , "1 - Inserimento" , "2 - Visualizza" , "3 - Fine"};

        boolean fine = false;

        int contaContatti = 0;

        do{
            switch (menu(opzioni, tastiera)){
                case 1:
    if (nContratti > contaContatti) {
        Persona nuovoContatto = LeggiContatto(tastiera, gestore, contaContatti);
        if (nuovoContatto != null) {
            gestore[contaContatti] = nuovoContatto;
            contaContatti++;
        }
    } else {
        System.out.println("Finiti contratti");
    }
    break;
                case 2:
                    if(contaContatti>0){
                        Visualizza(gestore, contaContatti);
                    }
                    else{
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    break;
                case 3:
                    fine = false;
                    break;
            }
        }while(!fine);
        System.out.println("Fine programma");
    }
    
    public static Persona LeggiContatto (Scanner tastiera, Persona[] gestore, int contacontatti){
    Persona contatto = new Persona();
    int scelta = 0;

    System.out.println("Inserisci il nome");
    String nome = tastiera.nextLine();
    System.out.println("Inserisci il cognome");
    String cognome = tastiera.nextLine();

    // Controllo se il contatto è già presente nella collezione
    for (int i = 0; i < contacontatti; i++) {
        if (gestore[i].nome.equals(nome) && gestore[i].cognome.equals(cognome)) {
            System.out.println("Questo contatto è già presente nella lista.");
            return null; // Ritorno null per indicare che il contatto non è stato aggiunto
        }
    }

    contatto.nome = nome;
    contatto.cognome = cognome;

    System.out.println("Inserisci il numero di telefono");
    contatto.numDiTelefono = tastiera.nextLine();
    String[] opzioni = {"Tipo di abbonamento" , "1 - cellulare" , "2 - Abitazione" , "3 - Azienda"};

    do {
        scelta = menu(opzioni, tastiera);
        switch (scelta){
            case 1: 
                contatto.tipo = Tipologia.cellulare;
                break;
            case 2: contatto.tipo = Tipologia.abitazione;
                break;
            case 3: contatto.tipo = Tipologia.azienda;
                break;
        }
    } while (scelta > 3 || scelta < 1);

    return contatto;
}
    // Metodo per visualizzare le persone dentro il nostro gestore
    public static void Visualizza(Persona gestore[], int contacontatti){
        for(int i = 0; i<contacontatti; i++){
            System.out.println(gestore[i].anagrafica());
        }
    }
}
