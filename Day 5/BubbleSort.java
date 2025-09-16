import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);

    public static void bubbleSort(int [] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

        bubbleSort(arr);
        System.out.println("\nBubble Sort: ");
        displayArr(arr);
    }
}
