import java.util.Scanner;

public class Patterns {

    static Scanner sc = new Scanner(System.in);

    // Pattern 1
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern1(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *

    public static void pattern2(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("  ");
            }

            for(int k=n-1; k>=i; k--) {
                System.out.print("* ");
            }

            System.out.println();
        } 
    }

    // Pattern 3
    // * * * *
    // * * *
    // * *
    // *

    public static void pattern3(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                // System.out.print("* ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    //       1
    //     1 2
    //   1 2 3
    // 1 2 3 4
    
    public static void pattern4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n-i+1; j++) {
                // System.out.print("* ");
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    //       1
    //     1 2 1
    //   1 2 3 2 1
    // 1 2 3 4 3 2 1

    public static void pattern5(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n-i+1; j++) {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }

            for(int l=i-1; l>=1; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }

    // Pattern 6
    //       1
    //     1 2 1
    //   1 2 3 2 1
    // 1 2 3 4 3 2 1
    //   1 2 3 2 1
    //     1 2 1
    //       1

    public static void pattern6(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n-i+1; j++) {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(k + " ");
            }

            for(int l=i-1; l>=1; l--) {
                System.out.print(l + " ");
            }

            System.out.println();
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("  ");
            }

            for(int k=1; k<n-i+1; k++) {
                System.out.print(k + " ");
            }

            for(int l=n-1-i; l>=1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        pattern6(n);
    }
}