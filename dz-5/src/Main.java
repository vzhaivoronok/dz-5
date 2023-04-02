public class Main {
    public static void main(String[] args) {

        int a = 6;
        int b = 2;
        int c = 4;
        int d = 8;

        int sum1 = sum (a, b);
        int sum2 = sum (c,d);

        compareAndPrint(sum1, sum2);

        sum1++;
        sum2 -=2;

        compareAndPrint(sum1, sum2);

        int rem1 = sum1%2;
        int rem2 = sum2%2;

        System.out.println(rem1 == 0 || rem2 == 0);
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static void compareAndPrint (int number1, int number2){
        System.out.println(number1>number2);
    }
}