public class Main {
    public static void main(String[] args) {
        System.out.println("Partenza");
        for (int i = 1; i <= 11; i++) {
            attesa();
            System.out.println(i + ": secondi");
            switch (i) {
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("due");
                    break;
                case 3:
                    System.out.println("tre");
                    break;
                case 4:
                    System.out.println("quattro");
                    break;
                case 5:
                    System.out.println("cinque");
                    break;
                case 6:
                    System.out.println("sei");
                    break;
                case 7:
                    System.out.println("sette");
                    break;
                case 8:
                    System.out.println("otto");
                    break;
                case 9:
                    System.out.println("nove");
                    break;
                case 10:
                    System.out.println("dieci");
                    break;
                default:
                    System.out.println("tempo non valido");
            }
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
