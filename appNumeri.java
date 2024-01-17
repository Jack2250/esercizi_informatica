import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int opzione;
        int n, casuale;
        boolean fine=true;
        Scanner tastiera = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        do{
            ClrScr();
            menu();
            System.out.println("seleziona un'opzione" );
            opzione = tastiera.nextInt();

            switch(opzione){
                case 1: System.out.println("genera numeri");
                    System.out.println("Quanti numeri casuali vuoi generare?");
                    n = scanner.nextInt();
                    int[] vettore = caricaVettore(n);
                    int[] vettore1;
                    vettore1 = vettore;
                    for (int i = 0; i < vettore.length; i++) {
                        System.out.println(vettore[i]);
                    }
                    System.out.println("----------------------------------------");
                    for (int i = 0; i < vettore1.length; i++) {
                        System.out.println(vettore1[i]);
                    }
                break;
                case 2: System.out.println("visualizza numeri");
                break;
                case 3: System.out.println("app numeri pari");
                break;
                case 4: System.out.println("exit");
                fine=false;
                break;
                default: System.out.println("opzione errata");
                break;
            }Wait(2000);

        }while(fine);








    }
    private static void menu(){
        System.out.println("== app numeri casuali");
        System.out.println("[1] genera numeri");
        System.out.println("[2] visualizza numeri");
        System.out.println("[3] app numeri pari");
        System.out.println("[4] exit");
    }
    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait(int tempo) {
        try{
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int[] caricaVettore(int n) {
        Random random = new Random();
        int casuale;
        int[] vettore = new int[n];
        for (int i = 0; i < n; i++) {
            casuale = random.nextInt(1, 101);
            vettore[i] = casuale;
        }
        return vettore;
    }
}
