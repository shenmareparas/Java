import java.util.Scanner;

class insertion_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] num = new int[n + 1];
        int[] num1 = new int[n + 1];

        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert: ");
        int m = sc.nextInt();

        System.out.println("Enter the value to insert: ");
        int p = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i == m) {
                num1[i] = p;
            } else if (i < m) {
                num1[i] = num[i];
            } else {
                num1[i] = num[i - 1];
            }
        }

        System.out.println("Elements are:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(num1[i] + " ");
        }

        sc.close();
    }
}
