import java.util.Scanner;

class star_pattern {   
    public static void main(String[] args) {
        System.out.println("Enter Rows: ");
        Scanner row =new Scanner(System.in);
        int r = row.nextInt();

        System.out.println("Enter Column: ");
        Scanner column =new Scanner(System.in);
        int c = column.nextInt();

        for (int i=0; i<r;i++){
            for(int j=0;j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        row.close();
        column.close();
    }
}
