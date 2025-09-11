import java.util.Scanner;

public class ControlStatements {
    static Scanner sc = new Scanner(System.in);

    public static void conditionalStatements() {
        int a, b;

        System.out.print("Enter a: ");        
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();

        
        System.out.println("\nif statement ---> Greater number");
        
        if(a > b) {
            System.out.println(a + " is greater than " + b);
        }

        System.out.println("\nif-else statements ---> Largest of two numbers");
        if(a > b) {
            System.out.println(a + " is greater");
        }

        else {
            System.out.println(b + " is greater");
        }

        System.out.println("\nif-else-if ---> Comparision of two numbers: ");

        if(a > b) {
            System.out.println(a + " is greater");
        }

        else if(b > a) {
            System.out.println(b + " is greater");
        }

        else
            System.out.println("Both are equal");

        System.out.println("\nNested if statements ---> leap year");
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                }

                else {
                    System.out.println(year + " is not a leap year");
                }
            }

            else {
                System.out.println(year + " is a leap year");
            }
        }

        else {
            System.out.println(year + " is not a leap year");
        }

        System.out.println("\nSwitch statements: ");
        System.out.println("1. Red \t 2. Green   3. Blue: ");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Red");
                break;

            case 2:
                System.out.println("Green");
                break;

            case 3:
                System.out.println("Blue");
                break;
        
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void iterationStatements() {
        System.out.println("for loop: \n");

        for(int i=0; i<5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("\nWhile loop: \n");

        int n = 5432;
        int rev = 0;

        System.out.println("Number: " + n);

        while (n > 0) { 
            int rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        }   
        System.out.println("Reveresed number: " + rev);

        System.out.println();

        System.out.println("\ndo...while loop: \n");
        n = 5432;
        rev = 0;

        System.out.println("Number: " + n);

        do { 
            int rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        } while (n > 0);
          
        System.out.println("Reveresed number: " + rev);
    }

    public static void main(String[] args) {
        System.out.println("<--------------Conditional Control statements-------------->\n");
        conditionalStatements();    
        System.out.println();

        System.out.println("<--------------Iteration Control statements--------------> \n");
        iterationStatements();
    }
}
