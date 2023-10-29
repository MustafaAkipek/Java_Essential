public class Main {
    public static void main(String[] args) {
        int sum1 = sumfunc1(5, 7);
        System.out.println(sum1);

        int sum2 = sumfunc2(5, 7, 8, 9, 1, 4, 2, 6);
        System.out.println(sum2);
    }

    public static int sumfunc1(int number1, int number2) {
        return number1 + number2;
    }

    public static int sumfunc2(int... numbers) {
        int sum = 0;
        for(int number:numbers) {
            sum += number;
        }
        return sum;
    }
}