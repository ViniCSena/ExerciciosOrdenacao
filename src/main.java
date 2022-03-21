import java.util.Random;
import java.util.Scanner;

public class main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        long tempI, tempTot;
        System.out.println("Ordenação de vetores.");
        char op ;
        int x = 1;
        int[] vet;
        while (x != 0) {
            System.out.println("Digite qual vetor vc quer medir o tempo com cada tipo de ordenação(A, B, C, D, E, F, G) - Para sair digite S ");
            op = input.next().charAt(0);
            switch (op) {
                case 'A':
                case 'a':
                    vet = vet(10);
                    System.out.println("Array tipo A escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'B':
                case 'b':
                    vet = vet(100);
                    System.out.println("Array tipo B escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet);
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'C':
                case 'c':
                    vet = vet(1000);
                    System.out.println("Array tipo C escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet.clone()));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'D':
                case 'd':
                    vet = vet(10000);
                    System.out.println("Array tipo D escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet.clone()));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'E':
                case 'e':
                    vet = vet(500000);
                    System.out.println("Array tipo E escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet.clone()));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'F':
                case 'f':
                    vet = vet(100000);
                    System.out.println("Array tipo F escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet.clone()));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'G':
                case 'g':
                    vet = vet(200000);
                    System.out.println("Array tipo G escolhido:");
                    tempI = System.nanoTime();
                    Ordenacao.insertionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do insertion:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.bubbleSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do bubble:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.quickSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do quick:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.mergeSort(convertToComparable(vet.clone()));
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do merge:" + tempTot);

                    tempI = System.nanoTime();
                    Ordenacao.selectionSort(vet.clone());
                    tempTot = System.nanoTime() - tempI;
                    System.out.println("Tempo do selection:" + tempTot);
                    break;
                case 'S':
                case 's':
                    x=0;
                    System.out.println("Obrigado por utlilizar este programa!");
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
