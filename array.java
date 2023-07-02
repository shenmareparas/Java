class array {
    public static void main(String[] args) {
        int mark[] = new int[3];
        // can also be done like this
        // int mark [];
        // mark = new int[3];
        mark[0] = 69;
        mark[1] = 96;
        mark[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(mark[i]);
        }
    }
}