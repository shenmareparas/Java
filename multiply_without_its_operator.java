public class multiply_without_its_operator {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int mul = a;
        for (int i = 0; i < b - 1; i++) {
            a = a + mul;
        }
        System.out.println(a);
    }
}
