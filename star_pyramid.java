import java.util.Scanner;

class star_pyramid {
    public static void main(String[] args) {
        System.out.println("EnterNumber: ");
        Scanner nc = new Scanner(System.in);
        int num = nc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        nc.close();
    }
}
