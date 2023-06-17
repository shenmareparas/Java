import java.util.*;

public class sum_function {
    public static int calculateSum (int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Total is: " + sum);
        sc.close();
    }
}
