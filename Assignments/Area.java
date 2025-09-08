import java.util.Scanner;

public class Area {
    static Scanner sc = new Scanner(System.in);
    public static double triangleArea(int b, int h) {
        return 0.5 * b * h;
    }

    public static double rhombusArea(int d1, int d2) {
        return 0.5 * d1 * d2;
    }

    public static double trapeziumArea(int h, int a, int b) { 
        return 0.5 * h * (a+b);
    }

    public static void main(String[] args) {
        int b, h, a, d1, d2;

        System.out.println("<----------Area of Triangle---------->");
        System.out.print("Enter base: ");
        b = sc.nextInt();
        System.out.print("Enter height: ");
        h = sc.nextInt();

        System.out.println("Area: " + triangleArea(b, h));

        System.out.println("\n<----------Area of Rhombus---------->");
        System.out.print("Enter diagonal d1: ");
        d1 = sc.nextInt();
        System.out.print("Enter diagonal d2: ");
        d2 = sc.nextInt();
        System.out.println("Area: " + rhombusArea(d1, d2));

        System.out.println("\n<----------Area of Trapezium---------->");
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter length of first parallel side(a): ");
        a = sc.nextInt();
        System.out.print("Enter length of second parallel side(b): ");
        b = sc.nextInt();
        System.out.println("Area: " + trapeziumArea(h, a, b));
    }
}
