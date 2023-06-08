import java.util.Scanner;

public class star_pattern_hollow {   
    public static void main(String[] args) {
        System.out.println("Enter Rows: ");
        Scanner row =new Scanner(System.in);
        int r = row.nextInt();

        System.out.println("Enter Column: ");
        Scanner column =new Scanner(System.in);
        int c = column.nextInt();

        for (int i=0; i<r;i++){
            for(int j=0;j<c; j++){
                if (i==0 || j==0|| i==r-1 ||j==c-1){
                System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        row.close();
        column.close();
    }
}
