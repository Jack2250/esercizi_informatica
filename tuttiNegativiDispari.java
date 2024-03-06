public class Main {
    public static void main(String[] args) {
        int [] numeri = {1,3,-2};

        if(negativiDispari(numeri)){
            System.out.println("Tutti negativi e dispari");
        }else{
            System.out.println("no");
        }

    }
    private static boolean negativiDispari (int [] a){
        int contatore =0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0 && a[i]%2 == -1){
                contatore ++;
            }

        }
        return(contatore==a.length);

    }
}
