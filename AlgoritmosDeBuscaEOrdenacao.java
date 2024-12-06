import java.util.*;

public class AlgoritmosDeBuscaEOrdenacao {
    
    // Método de ordenação: Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // Método de ordenação: Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Método de busca: Linear Search
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se não encontrado
    }
    
    // Método de busca: Binary Search
    public static int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Retorna -1 se não encontrado
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um algoritmo:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Linear Search");
        System.out.println("4. Binary Search");

        int choice = scanner.nextInt();
        
        if (choice == 1 || choice == 2) {
            System.out.println("Digite o tamanho da lista:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Digite os elementos da lista:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            long startTime = System.nanoTime();
            if (choice == 1) {
                bubbleSort(arr);
                System.out.println("Lista ordenada com Bubble Sort:");
            } else {
                selectionSort(arr);
                System.out.println("Lista ordenada com Selection Sort:");
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo de execução: " + duration + " nanosegundos");
            System.out.println(Arrays.toString(arr));
        } else if (choice == 3 || choice == 4) {
            System.out.println("Digite o tamanho da lista:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Digite os elementos da lista:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Digite o elemento a ser procurado:");
            int x = scanner.nextInt();
            
            long startTime = System.nanoTime();
            int index = -1;
            if (choice == 3) {
                index = linearSearch(arr, x);
                System.out.println("Resultado da busca Linear:");
            } else {
                Arrays.sort(arr); // Necessário ordenar para a busca binária
                index = binarySearch(arr, x);
                System.out.println("Resultado da busca Binária:");
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo de execução: " + duration + " nanosegundos");
            
            if (index != -1) {
                System.out.println("Elemento encontrado no índice: " + index);
            } else {
                System.out.println("Elemento não encontrado.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
