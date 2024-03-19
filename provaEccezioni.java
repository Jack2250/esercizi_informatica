import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dato1, dato2, divisione;

        Scanner tastiera = new Scanner(System.in);

        try {
            System.out.println("Leggi due dati");
            dato1 = tastiera.nextInt();
            dato2 = tastiera.nextInt();
            divisione = dato1 / dato2;
            System.out.println("la divisione risulta" + divisione);

        } //catch (ArithmeticException e){
        catch (InputMismatchException e) {
            System.out.println("Errore " + e.toString());

        }

    }
}
