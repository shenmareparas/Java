import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Enter Your Marks out of 100: ");
        int marks = nc.nextInt();
        String message = "Your Grade is: ";
        if (marks > 100) {
            System.out.println("Marks should be out of 100");
        }
        if (marks >= 90 & marks <= 100) {
            System.out.println(message + "A");
        }
        if (marks >= 80 & marks < 90) {
            System.out.println(message + "B");
        }
        if (marks >= 60 & marks < 80) {
            System.out.println(message + "C");
        }
        if (marks >= 40 & marks < 60) {
            System.out.println(message + "D");
        }
        if (marks < 40) {
            System.out.println(message + "F");
        }
        nc.close();
    }
}