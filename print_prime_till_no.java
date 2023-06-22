class print_prime_till_no {
    public static void sieveOfEratosthenes(Boolean[] isPrime) {
        for (int p = 2; p*p <= isPrime.length; p++) {
            if (isPrime [p]){
                for(int i = p*p; i <= isPrime .length - 1; i += p){
                    isPrime [i] = false;
                }
            }
        }
    }

    public static void initilizeSieve(Boolean[] isPrime) {
        for(int i = 2; i < isPrime.length; i++)
        isPrime[i] = true;
    }

    public static void main(String[] args) {
        int n = 30;
        Boolean[] isPrime = new Boolean[n+1];
        initilizeSieve(isPrime);
        sieveOfEratosthenes(isPrime);
        System.out.println("Prime numbers upto " + n + ":");
        for(int i = 2; i < n; i++) {
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
}
}