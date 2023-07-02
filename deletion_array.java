import java.util.Scanner;

class deletion_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n - 1];

        System.out.println("Enter Value");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter index of value to be deleted");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else {
                b[i - 1] = a[i];
            }
            sc.close();
        }
    }
}