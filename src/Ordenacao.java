public class Ordenacao {
    private static void merge(Comparable[] a, Comparable[] tempArray, int leftpos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tempPos = leftpos;
        int numElements = rightEnd - leftpos + 1;
        while (leftpos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftpos].compareTo(a[rightPos]) <= 0)
                tempArray[tempPos++] = a[leftpos++];
            else
                tempArray[tempPos++] = a[rightPos++];

            while (leftpos <= leftEnd)
                tempArray[tempPos++] = a[leftpos++];

            while (rightPos <= rightEnd)
                tempArray[tempPos++] = a[rightPos++];

            for (int i = 0; i < numElements; i++, rightEnd--)
                a[rightEnd] = tempArray[rightEnd];
        }
    }

    public static void mergeSort(Comparable[] a) {
        Comparable[] tempArray = new Comparable[a.length];
        mergeSort(a, tempArray, 0, a.length - 1);
    }

    private static void mergeSort(Comparable[] a, Comparable[] tempArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tempArray, left, center);
            mergeSort(a, tempArray, center + 1, right);
            merge(a, tempArray, left, center + 1, right);
        }
    }

    //insertion
    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;
        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }

    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }

            }

            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }

    //bubble
    public static void bubbleSort(int[] vetor) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    //quick
    public static void quickSort(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }

        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}