public class Main {
    public static void main(String[] args) {
        
        int[] array = {9, 4, 6, 5, 2, 10, 7, 1, 8};
        
        // Chiama il metodo per ordinare i numeri pari
        bubbleSort(array);
        
        // Stampa l'array risultante
        printArray(array);
    }
    
    public static void bubbleSort(int[] array) {
        // Trova gli indici dei numeri pari e i loro valori
        int contatore = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contatore++;
            }
        }
        
        int[] arrayPari = new int[contatore];
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPari[indice++] = array[i];
            }
        }

        // Applica il bubble sort sui numeri pari
        for (int i = 0; i < arrayPari.length - 1; i++) {
            for (int j = 0; j < arrayPari.length - 1 - i; j++) {
                if (arrayPari[j] > arrayPari[j + 1]) {
                    int temp = arrayPari[j];
                    arrayPari[j] = arrayPari[j + 1];
                    arrayPari[j + 1] = temp;
                }
            }
        }

        // Reinserisci i numeri pari ordinati negli indici corretti dell'array originale
        indice = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = arrayPari[indice++];
            }
        }
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((" ")+array[i]);
            
        }
    }
}
