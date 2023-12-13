/*Il selettore può assumere come valore soli valori primitivi
byte,short,char,int;
tipo stringa, tipo enumeratore
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mese;

        System.out.println("Inserisci un numero equivalente a un mese dell'anno");
        Scanner tastiera = new Scanner(System.in);
        mese = tastiera.nextInt();


        switch (mese) {
            case 1:

            case 2:

            case 3:
                System.out.println("inverno");
                break;

            case 4:

            case 5:
                
            case 6:
                System.out.println("primavera");
                break;

            case 7:

            case 8:

            case 9:
                System.out.println("estate");
                break;
            case 10:

            case 11:

            case 12:
                System.out.println("autunno");
                break;

            default:
                System.out.println("mese non valido");
        }

    }


    public static void attesa() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
    }
}
