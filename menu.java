import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] opzioni ={"titolo","[1] opzione 1","[2] opzione 2","[3] opzione 3","[4] exit"} ;
        Scanner tastiera = new Scanner(System.in);
        menu(opzioni, tastiera);

    }
    private static int menu (String[] opzioni, Scanner kyb){
        int scelta;
        do{

            System.out.println("----"+ opzioni [0]+ "----");
            for(int i=1;i< opzioni.length;i++){
                System.out.println(opzioni [i]);

            }
            System.out.println("------------");
            scelta = kyb.nextInt();

        }while(!(scelta>= 1 && scelta<=opzioni.length));


        return 0;
    }
}
