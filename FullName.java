import java.util.Scanner;

class FullName {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = nc.nextLine();
        System.out.print("Enter Your Surname: ");
        String surname = nc.nextLine();
        String message = "Your Full Name is ";
        System.out.println(message + name + " " + surname);
        nc.close();
    }
}