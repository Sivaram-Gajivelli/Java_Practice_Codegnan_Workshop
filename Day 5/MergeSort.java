import java.util.Scanner;

public class MergeSort {
    static Scanner sc = new Scanner(System.in);

    static void mergeSort(int arr[]) {
        if(arr.length <= 1) {
            return ;
        }

        int mid = arr.length / 2;

        int leftArr[] = new int[mid];
        int rightArr[] = new int[arr.length - leftArr.length];
        int j = 0;

        for(int i=0; i<arr.length; i++) {
            if(i < mid) {
                leftArr[i] = arr[i];
            }

            else {
                rightArr[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    static void merge(int leftArr[], int rightArr[], int arr[]) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int l=0, r=0, i=0;

        while(l < leftSize && r < rightSize) {
            if(leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            }

            else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
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

        mergeSort(arr);

        System.out.println("Merge Sort Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
