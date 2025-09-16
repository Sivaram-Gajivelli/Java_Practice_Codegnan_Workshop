import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    static Scanner sc = new Scanner(System.in);

    public static int searchElement(int a[], int x) {
        int first = 0, last=a.length - 1, mid;
        while(first <= last) {
            mid = (int)(first + last) / 2;

            if(a[mid] == x)  {
                return mid;
            }

            else if(a[mid] > x) {
                last = mid - 1;
            }

            else {
                first = mid + 1;
            }
        }

        return -1;
    }

    public static void displayArray(int a[]) { 
        for(int i: a) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeElement(int a[], int x) {
        int k=0, b[] = new int[a.length];
        for (int i : a) {
            if(i == x) {
                continue;
            }

            b[k++] = i;
        }

        return b;
    }

    public static int maximum(int a[]) {
        int max = a[0];
        for (int i : a) {
            if(i > max) {
                max = i;
            }
        }

        return max;
    }
    public static int minimum(int a[]) {
        int min = a[0];
        for (int i : a) {
            if(i < min) {
                min = i;
            }
        }

        return min;
    }

    public static void findDuplicates(int a[]) { 
        // for(int i=0; i<a.length; i++) {
        //     for(int j=i+1; j<a.length; j++) {
        //         if(a[i] == a[j] && i != j) {
        //             System.out.println(a[i] + " ");
        //         }
        //     }
        // }


        // Sliding window technique
        Arrays.sort(a);

        int duplicates[] = new int[a.length];
        int k=0;

        for(int i=0; i<a.length-1; i++) {
            if(a[i] == a[i+1]) {
                duplicates[k++] = a[i];
            }
        }

        for(int i=0; i<k-1; i++) {
            if(duplicates[i] != duplicates[i+1]) {
                System.out.print(duplicates[i] + " ");
            }
        }

        System.out.println(duplicates[k-1]);
    }

    public static void findFrequency(int a[]) {
        int freq = 1, i;

        for(i=0; i<a.length-1; i++) {
            if(a[i] == a[i+1]) {
                freq++;
            }

            else {
                System.out.println(a[i] + " -> " + freq);
                freq = 1;
            }
        }

        System.out.println(a[i] + " -> " + freq);
    }

    public static void main(String[] args) {
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        int a[] = new int[n];
                
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array: ");
        displayArray(a);

        // Arrays.sort(a);

        // System.out.println("\nSorted Array: ");
        // displayArray(a);

        // System.out.print("\nEnter element to search: ");
        // int x = sc.nextInt();

        // int res = searchElement(a, x);

        // if(res == -1) {
        //     System.out.println(x + " not found in the list");
        // }

        // else {
        //     System.out.println(x + " found at index " + res);
        // }

        // System.out.print("\nEnter the element to remove: ");
        // x = sc.nextInt();

        // a = removeElement(a, x);

        // displayArray(a);

        // System.out.println("\n\nMaximum element: " + maximum(a));
        // System.out.println("Minimum element: " + minimum(a));

        // System.out.println("\nThe duplicate elements are: ");
        // findDuplicates(a);

        System.out.println("\nFrequency of each element: \n");
        findFrequency(a);

    }
}
