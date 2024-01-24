import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] opzioni = {"titolo", "[1] opzione 1", "[2] opzione 2", "[3] opzione 3", "[4] exit"};
        Scanner tastiera = new Scanner(System.in);
        boolean fine = true;

        do{
            switch (menu(opzioni, tastiera)) {
                case 1: System.out.println("opzione 1");
                    break;
                case 2: System.out.println("opzione 2");
                    break;
                case 3: System.out.println("opzione 3");
                    break;
                case 4: System.out.println("exit");
                fine=false;
                    break;
                default:

            }Wait();

        }while(fine);



    }

    private static int menu(String[] opzioni, Scanner kyb) {
        int scelta;
        do {
            ClrScr();

            System.out.println("----" + opzioni[0] + "----");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);

            }
            System.out.println("------------");
            scelta = kyb.nextInt();
            if (!(scelta >= 1 && scelta <= opzioni.length)) {
                System.out.println("Scelta errata");
                Wait();

            } Wait();

        } while (!(scelta >= 1 && scelta <= opzioni.length));


        return scelta;
    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
