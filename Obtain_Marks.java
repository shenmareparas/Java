import java.util.Scanner;

class Marks{
    public static void main(String[] args) {
        Scanner nc = new Scanner (System.in);
        System.out.print("Enter Your Subject 1 Marks: ");
        int Subject1 = nc.nextInt();
        System.out.print("Enter Your Subject 2 Marks: ");
        int Subject2 = nc.nextInt();
        System.out.print("Enter Your Subject 3 Marks: ");
        int Subject3 = nc.nextInt();
        System.out.print("Enter Your Subject 4 Marks: ");
        int Subject4 = nc.nextInt();
        System.out.print("Enter Your Subject 5 Marks: ");
        int Subject5 = nc.nextInt();
        System.out.print("Enter Your Subject 6 Marks: ");
        int Subject6 = nc.nextInt();
        String message = "Your Average Marks is: ";
        
        int TotalMarks = Subject1 + Subject2 + Subject3 + Subject4 + Subject5 + Subject6;
        int MarksAvg = TotalMarks*100/600;
        System.out.println(message + MarksAvg);

        nc.close();
    }
}