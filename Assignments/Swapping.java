import java.util.Scanner;

public class Swapping {

    static Scanner sc = new Scanner(System.in);

    public static void swappingUsingThirdVar(int a, int b) {
        int temp;

        System.out.println("Before swapping:");
        System.out.println("a: " + a + " b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swappingWithoutUsingThirdVar(int a, int b) {
        System.out.println("Before swapping:");
        System.out.println("a: " + a + " b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a, b;

        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        
        System.out.println("\nSwapping using third variable: ");
        swappingUsingThirdVar(a, b);

        System.out.println("\nSwapping without using third variable: ");
        swappingWithoutUsingThirdVar(a, b);
    }
}