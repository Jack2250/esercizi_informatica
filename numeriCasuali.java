import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        int n, casuale;
        Scanner scanner =new Scanner(System.in);
        Random  random = new Random();
        System.out.println("Quanti numeri casuali vuoi generare?");
        n = scanner.nextInt();
        /*int[] vettore= new int[n];
        int [] vettore1;
        for(int i=0;i<n;i++){
            casuale = random.nextInt(1,101);
            vettore[i] = casuale;
        }*/
        int [] vettore= caricaVettore(n);
        int [] vettore1;
        vettore1= vettore;
        for(int i=0;i<vettore.length;i++){
            System.out.println(vettore[i]);
        }
        System.out.println("----------------------------------------");
        for(int i=0;i<vettore1.length;i++){
            System.out.println(vettore1[i]);
        }


    }
    public static int[] caricaVettore(int n){
        Random  random = new Random();
        int casuale;
        int[] vettore= new int[n];
        for(int i=0;i<n;i++){
            casuale = random.nextInt(1,101);
            vettore[i] = casuale;
        }
        return vettore;
    }
}
