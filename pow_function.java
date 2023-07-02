import java.util.*;
import java.lang.Math;

public class pow_function {
    public static int calculatePow(int num, int raisedto) {
        // (int) to convert to int
        int value = (int) Math.pow(num, raisedto);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power value: ");
        int raisedto = sc.nextInt();
        int value = calculatePow(num, raisedto);
        System.out.println(num + " raised to " + raisedto + " is: " + value);
        sc.close();
    }
}