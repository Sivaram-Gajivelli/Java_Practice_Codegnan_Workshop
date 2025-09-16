import java.util.Scanner;

public class SelectionSort {
    static Scanner sc = new Scanner(System.in);

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

        System.out.println("\nSelection Sort: ");
        selectionSort(arr);
        displayArr(arr);
    }
}
