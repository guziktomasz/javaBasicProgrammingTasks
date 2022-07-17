package javaPodstawyProgramowanie;

public class Task10sumDigits {
    public static void main(String[] args) {
        int number = 545;
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
