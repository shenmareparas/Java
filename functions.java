import java.util.*;

public class functions {
    public static void printMyName(String name) {
        System.out.print("Your name is " + name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
        sc.close();
    }
}
