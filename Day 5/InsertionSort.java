import java.util.Scanner;

public class InsertionSort {
    static Scanner sc = new Scanner(System.in);

    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
    }

    public static void displayArr(int [] arr) {
        for(int i=0; i<arr.length; i++ ){ 
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements in the arr: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArr(arr);

        insertionSort(arr);
        System.out.println("\nAfter sorting: ");
        displayArr(arr);   
    }
}
