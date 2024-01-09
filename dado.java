import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    Random valore = new Random();
	    int valFaccia= valore.nextInt(0,6)+1;
	    //for(int i=1;i<=6;i++){
	        dado(valFaccia);
	        attesa(2);
	        cls();
	    //}
		
		
	}
	public static void dado(int faccia){
	    
	    switch(faccia){
	        case 1: System.out.println("\t\t\t\t ╔═════════╗");
	                System.out.println("\t\t\t\t ║         ║");
	                System.out.println("\t\t\t\t ║    0    ║");
	                System.out.println("\t\t\t\t ║         ║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	        
	        case 2: System.out.println("\t\t\t\t ╔═════════╗");
	                System.out.println("\t\t\t\t ║0        ║");
	                System.out.println("\t\t\t\t ║         ║");
	                System.out.println("\t\t\t\t ║        0║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	           
	       
	       case 3:  System.out.println("\t\t\t\t ╔═════════╗");
	                System.out.println("\t\t\t\t ║0        ║");
	                System.out.println("\t\t\t\t ║    0    ║");
	                System.out.println("\t\t\t\t ║        0║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	           case 4: 
	               System.out.println("\t\t\t\t  ╔═════════╗");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t ║         ║");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	               case 5:   
	               System.out.println("\t\t\t\t  ╔═════════╗");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t ║    0    ║");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	                   case 6:  
	               System.out.println("\t\t\t\t  ╔═════════╗");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t ║0       0║");
	                System.out.println("\t\t\t\t └═════════╝");
	        break;
	            
	       
	    }
	    
	}
	 public static void attesa(int x) {
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Metodo per cancellare il contenuto stampato su cmd   
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
