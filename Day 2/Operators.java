import java.util.*;

public class Operators {
    static Scanner sc = new Scanner(System.in);

    public static void arithmeticOperators(int a, int b) {
        System.out.println("Arithmetic operators: \n");
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));
    }

    public static void relationalOperators(int a, int b) {
        System.out.println("Relational operators: \n");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
    }

    public static void logicalOperators(boolean a, boolean b) {
        System.out.println("Logical operators: \n");
        System.out.println("a = false, b = true");
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!(a): " + (!a));
    }

    public static void assignmentOperators(int a, int b ) {
        System.out.println("Assignment operators: \n");
        System.out.println("a = " + a + " b = " + b);
        a += b;
        System.out.println("a += b -> a: " + a + " b: " + b);
        a -= b;
        System.out.println("a -= b -> a: " + a + " b: " + b);
        a *= b;
        System.out.println("a *= b -> a: " + a + " b: " + b);
        a /= b;
        System.out.println("a /= b -> a: " + a + " b: " + b);
    }

    public static void unaryOperators(int a) {
        System.out.println("Unary operators: \n");
        System.out.println("Pre increment  ++a: " + (++a));
        System.out.println("Pre decrement  --a: " + (--a));
        System.out.println("Post increment a++: " + (a++));
        System.out.println("Post decrement a--: " + (a--));
    }

    public static void main(String[] args) {
        int a, b;

        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.println();

        arithmeticOperators(a, b);
        System.out.println();

        relationalOperators(a, b);
        System.out.println();

        logicalOperators(false, true);
        System.out.println();

        assignmentOperators(a, b);
        System.out.println();

        System.out.println("Terenary operator: \n");
        System.out.println("(a > b) ? a : b ---> " + ((a > b) ? a : b));
        System.out.println();

        unaryOperators(a);
        System.out.println();
    }
}
