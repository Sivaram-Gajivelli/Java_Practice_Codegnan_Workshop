public class VariableTypes {
    //instance variables
    int a1 = 50, a2 = 60;

    //static variables
    static int c = 100;
    static int d = 200;

    final int f = 500;

    static void localVariables() {
        System.out.println("Local Variables");
        int a = 10;
        int b = 20;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }


    public static void main(String[] args) {
        localVariables();

        System.out.println("\nIntance variables:");
        VariableTypes obj = new VariableTypes();
        System.out.println("a1: " + obj.a1);
        System.out.println("a2: " + obj.a2);

        System.out.println("\nStatic Variables:");
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // obj.f += 100; -----> returns error : cannot assign a value to final variable f

        System.out.println("\nFinal varaible: " + obj.f);
    }
}