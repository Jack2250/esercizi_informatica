public class Main {
    public static void main(String[] args) {
        String stringa = "AbCDefG";
        if (contieneSoloAlfabetici(stringa)) {
            System.out.println("Tutti alfabetici");
        } else {
            System.out.println("Stringa errata");
        }
    }

    public static boolean contieneSoloAlfabetici(String str) {
        // Itera attraverso ogni carattere della stringa
        for (int i = 0; i < str.length(); i++) {
            // Verifica se il carattere non è compreso tra 'A' e 'Z'
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                return false; // Se trova un carattere non alfabetico, ritorna false
            }
        }
        return true; // Se tutti i caratteri sono alfabetici, ritorna true
    }
}
