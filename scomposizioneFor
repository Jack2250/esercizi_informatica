import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scomposizione di un numero intero in cifre
        int numero = 1234;
        int resto;
        int contaCifre = 0;
        /*
        1) 1234:10=123 resto 4
        2) 123:10=12 resto 3
        3) 12:10=1 resto 2
        4)1:10=0 resto 1
        */
        //Esercizio risolto con il while
        /*while (numero != 0) {
            resto = numero % 10;
            numero = numero / 10;
            contaCifre = contaCifre + 1;
            System.out.print(resto + " ");

        }*/
        //Esercizio risolto con do-while
        /*do{
            if(numero!=0){
                resto = numero % 10;
                numero = numero / 10;
                contaCifre = contaCifre + 1;
                System.out.print(resto + " ");
            }

        }while(numero!=0);*/

        //Esercizio risolto con for
        int i;
        for (i = 0; numero != 0; i++) {
            resto = numero % 10;
            numero = numero / 10;
            //contaCifre = contaCifre + 1;
            System.out.print(resto + " ");
        }
        System.out.println();
        if (i == 0) {
            System.out.println("non è stato inserito un numero valido");

        } else {
            System.out.println("Il numero conteneva " + i + " cifre");
        }
    }
}
