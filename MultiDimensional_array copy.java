import java.util.Scanner;
class MultiDimensional_array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of Row: ");
    int n = sc.nextInt();
    System.out.println("Enter the value of Column: ");
    int m = sc.nextInt();   
    int a[][] = new int[n][m];
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++){
        a[i][j] = sc.nextInt();
    }
    }
    System.out.println("This is your entered values");
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++){
        System.out.print(a[i][j]+" ");
    }
}
sc.close();
}}