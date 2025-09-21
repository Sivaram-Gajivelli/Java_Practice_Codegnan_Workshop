import java.util.Scanner;

public class QuickSort {
    static Scanner sc = new Scanner(System.in);

    public static void quickSort(int arr[], int left, int right) {
        if(left > right) return;

        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    public static int partition(int arr[], int left, int right) {
        int pivot = arr[right];

        int i = left-1;

        for(int j=left; j<right; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        return i;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("Enter elements: ");
        int [] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length-1);

        System.out.println("Quick Sort Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
