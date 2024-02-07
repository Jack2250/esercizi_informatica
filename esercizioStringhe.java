import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        String[] vettore = {"America", "spagna", "Marocco", "italia"};
        /*for(int i=0; i<vettore.length; i++) { if(vettore[i].charAt(0)>= 'A' && vettore[i].charAt(0)<= 'Z') { System.out.println("Le Parole con la maiusola sono: "+vettore[i]); } }*/
        String[] vet2;
        vet2 = caricavettore(vettore);
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Le parole maiusc sono: " + vet2[i]);
        }

    }

    private static String[] caricavettore(String[] vettore) {

        int j = 0;
        int conteggio = 0;
//primo giro conto for(int i=0; i<vettore.length; i++)
        {
            if (vettore[i].charAt(0) >= 'A' && vettore[i].charAt(0) <= 'Z') {
                conteggio++;
            }
        }
        String[] vet2 = new String[conteggio];
//secondo giro riempio for(int i=0; i<vettore.length; i++)
        {
            if (vettore[i].charAt(0) >= 'A' && vettore[i].charAt(0) <= 'Z') {
                vet2[j] = vettore[i];
                j++;
            }
        }

        return vet2;
    }
}
