import java.util.Scanner;

class array_declaration {
    public static void main(String[] args) {
        System.out.print("Enter number of Elements in Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.print("Enter array Values: ");

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Array Elements Values: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
            sc.close();
        }
    }
}
