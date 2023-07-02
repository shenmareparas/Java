import java.util.Scanner;

class index_finding_in_multi_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Row: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of Column: ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == x) {
                    System.out.println("X found at location (" + i + "," + j + ")");
                } else {
                    System.out.println("X not fount at any location");
                }
            }
            sc.close();
        }
    }
}