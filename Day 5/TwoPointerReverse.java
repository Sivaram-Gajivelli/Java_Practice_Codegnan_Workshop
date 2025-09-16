import java.util.Scanner;

public class TwoPointerReverse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        char strarr[] = str.toCharArray();

        int l=0, r=str.length()-1;

        long start = System.nanoTime();

        while(l <= r) {
            char c = strarr[l];
            strarr[l] = strarr[r];
            strarr[r] = c;

            l++;
            r--;
        }

        long end = System.nanoTime();

        long time = end - start;

        double timeInSecs = time / 1e9;

        System.out.printf("Time: %.9fsec\n", timeInSecs);

        System.out.println(strarr);
    }    
}
