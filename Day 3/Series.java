import java.util.Scanner;

public class Series {

    static Scanner sc = new Scanner(System.in);

    // 1 + x + x^2 + .... + x^(n-1)

    public static void series1() {
        int x, n, sum = 0;

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print((int)(Math.pow(x, i)) + " ");
            sum += (int)Math.pow(x, i);
        }

        System.out.println("\nSum: " + sum);
    }

    // 1 - x + x^2 - x^3 .... + x^(n-1)
    public static void series2() { 
        int x, n, sum = 0;

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                System.out.print((int)(Math.pow(x, i)) + " - ");
                sum += (int)Math.pow(x, i);
            }

            else {
                System.out.print((int)(Math.pow(x, i)) + " + ");
                sum -= (int)Math.pow(x, i);
            }
        }

        System.out.println("\nSum: " + sum);
    }

    // 0+ 1/2 + 2/3 + 3/4 + ....
    public static void series3() {
        int n;
        double sum = 0.0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.print(0 + " ");
        for(int i=1; i<n; i++) {
            // System.out.print(i);
            System.out.println("i, i+1: " + i + " "+ (i+1));
            sum += (double) i / (i+1);
        }

        System.out.println("\nSum: " + sum);
    }

    public static void perfectNumber() {
        int n, sum = 0, count = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for(int i=4; i<=n; i++){
            sum = 0;
            for(int j=1; j<i; j++) {
                if(i%j == 0) {
                    sum += j;
                }
            }

            if(i == sum) {
                System.out.print(i + " ");
                count += 1;
            }
        }

        System.out.println("\nTotal no. of perfect numbers: " + count);

    }

    public static void main(String[] args) {
        // series1();    
        // series2();
        // series3();
        perfectNumber();
    }    
}
