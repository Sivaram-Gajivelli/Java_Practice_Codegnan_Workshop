import java.util.Scanner;

public class Tables {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            // System.out.println(n + " * " + i + " = " + (n*i));
            System.out.printf("%d * %d = %d \n", n, i, (n*i));
        }
    }    
}
