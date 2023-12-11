import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner keyBoard = new Scanner(System.in);
	    double a;
	    int c;
	    double f;
	    System.out.println("Inserisci la base");
	    a = keyBoard.nextDouble();
	    System.out.println("Inserisci l'esponente");
	    c = keyBoard.nextInt();
	    
	    f=a;
	    
	    for(int i=1;i<c;i++ ){
	        f=f*a
	    }
	    System.out.println("" + f);
	    
	}
}
