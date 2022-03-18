import java.util.Random;
import java.util.Scanner;

public class main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        long tempI, tempTot;
        System.out.println("Ordenação de vetores. Digite qual vetor vc quer medir o tempo com cada tipo de ordenação(A, B, C, D, E, F E G) - Para sair digite S ");
// char op = input.next().charAt(0);
        char op = 'a';
        int x = 1;
        while (x != 0) {
            switch (op) {
                case 'A':
                case 'a':
                    System.out.println("Array tipo A escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet(10));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet(10));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet(10));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet(10)));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet(10));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'B':
                case 'b':
                    System.out.println("Array tipo B escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet(100));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet(100));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet(100));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet(100)));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet(100));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'C':
                case 'c':
                    System.out.println("Array tipo C escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet(1000));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet(1000));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet(1000));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet(1000)));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet(1000));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
            }
        }
    }

    private static int[] vet(int tamanho) {
        Random random = new Random();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100);
        }
        return vetor;
    }

    private static Comparable[] convertToComparable(int[] vet){
        Integer[] vetComp = new Integer[vet.length];
        int x = 0;
        for (int i:vet) {
            vetComp[x] = i;
            x++;
        }
        return vetComp;
    }


}
