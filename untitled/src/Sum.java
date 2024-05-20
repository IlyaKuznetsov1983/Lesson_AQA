public class Sum {


    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("sum is positive");

        } else {
            System.out.println("Sum is negative");
        }
    }
}

