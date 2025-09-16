import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        int mid;

        while(l <= r) {
            mid = (l + r) / 2;

            if(arr[mid] == x) {
                return mid;
            }

            else if(arr[mid] < x) {
                l = mid + 1;
            }

            else {
                r = mid - 1;
            }
        }

        return -1;
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


        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        int res = binarySearch(arr, x);

        if(res == -1) {
            System.out.printf("%d not found", x);
        }

        else {
            System.out.printf("%d found at %d", x, res);
        }
    }    
}
