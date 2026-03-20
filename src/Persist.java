class Persist {
    public static int persistence(long n) {

        if (n < 10) {
            return 0;
        }

        long num = n;
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return 1 + persistence(product);
    }

    public static void main(String[] args){
        System.out.println(persistence(339));
    }
}