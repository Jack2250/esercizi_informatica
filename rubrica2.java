import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        String password = "your_password"; // Imposta una password predefinita
        int maxContatti = 100; // il numero massimo di contatti che la rubrica può contenere.
        int maxCronologia = 10; // il numero massimo di chiamate che la cronologia può contenere.
        String[] nomiContatti = new String[maxContatti]; // array per memorizzare i nomi,
        String[] numeriContatti = new String[maxContatti]; // i numeri
        boolean[] contattiNascosti = new boolean[maxContatti]; // e lo stato (nascosto o visibile) dei contatti
        String[] cronologiaChiamate = new String[maxCronologia]; // array per memorizzare la cronologia delle chiamate.
        int contaContatti = 0; // contatore per il numero attuale di contatti.
        int contaChiamate = 0; // contatore per il numero attuale di chiamate nella cronologia.
        boolean uscita = true;
        
        while (uscita) {
            
            System.out.println("1. Aggiungi Contatto");
            System.out.println("2. Visualizza Contatti");
            System.out.println("3. Nascondi/Mostra Contatto");
            System.out.println("4. Visualizza Cronologia Chiamate");
            System.out.println("5. Aggiungi Chiamata alla Cronologia");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = tastiera.nextInt();
            tastiera.nextLine(); 

            switch (scelta) {
                case 1: // Aggiunge un nuovo contatto alla rubrica.
                    if (contaContatti >= maxContatti) {
                        System.out.println("La rubrica è piena.");
                    } else {
                        System.out.println("Inserisci il nome del contatto: ");
                        String nome = tastiera.nextLine();
                        System.out.println("Inserisci il numero di telefono del contatto: ");
                        String numTelefono = tastiera.nextLine();

                        nomiContatti[contaContatti] = nome;
                        numeriContatti[contaContatti] = numTelefono;
                        contattiNascosti[contaContatti] = false; // Non nascosto di default
                        contaContatti++;
                    }
                    break;
                case 2: // Visualizza i contatti nascosti se la password è corretta
                    
                    if(contaContatti > 0){
                        System.out.print("Inserisci la password per visualizzare i contatti nascosti: "); // momento saliente del software dove 
                        boolean vediNascosti = passwordInserita.equals(password); //si verifica la password e mostra i contatti nascosti
                        String passwordInserita = tastiera.nextLine();

                        for (int i = 0; i < contaContatti; i++) {
                            if (vediNascosti || !contattiNascosti[i]) {
                                System.out.println(nomiContatti[i] + " " + numeriContatti[i] + " ");
                            }
                        }
                    }else{
                        System.out.println("Non ci sono contatti da visualizzare");
                    }
                    
                    break;
                case 3: // Nasconde o rende visibile un contatto specificato dall'utente.
                    if(contaContatti > 0){
                        System.out.println("Inserisci il nome del contatto da nascondere/mostrare: ");
                        String nome = tastiera.nextLine();

                        boolean trovato = false;
                        for (int i = 0; i < contaContatti; i++) {
                            if (nomiContatti[i].equalsIgnoreCase(nome)) {
                                contattiNascosti[i] = !contattiNascosti[i];
                                if (contattiNascosti[i]) {
                                    System.out.println(nome + " è ora nascosto.");
                                } else {
                                    System.out.println(nome + " è ora visibile.");
                                }
                                trovato = true;
                                break;
                            }
                        }
                        if (!trovato) {
                        System.out.println("Contatto non trovato.");
                        }
                        
                        }else{
                            System.out.println("Non sono stati inseriti contatti");
                        }
                    
                    break;
                case 4: // Visualizza la cronologia delle chiamate.
                    if(contaChiamate > 0){
                        for (int i = 0; i < contaChiamate; i++) {
                        System.out.println(cronologiaChiamate[i]);
                        }
                    }else{
                        System.out.println("Non state effetuate chiamate");
                    }
                    
                    break;
                case 5: // Aggiunge una chiamata alla cronologia, gestendo la dimensione massima della cronologia.
                    System.out.println("Inserisci il nome del contatto per la chiamata: ");
                    String nomeChiamata = tastiera.nextLine();

                    if (contaChiamate >= maxCronologia) {
                        for (int i = 1; i < maxCronologia; i++) {
                            cronologiaChiamate[i - 1] = cronologiaChiamate[i];
                        }
                        contaChiamate = maxCronologia - 1;
                    }
                    cronologiaChiamate[contaChiamate] = nomeChiamata;
                    contaChiamate++;
                    break;
                case 6:
                    System.out.println("Uscita in corso...");
                    uscita = false;
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
    }
}

