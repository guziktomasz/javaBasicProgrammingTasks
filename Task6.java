package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę n (typu int)
i obliczy sumę szeregu harmonicznego od 1 do n, zgodnie ze wzorem poniżej:
Hn = 1 + 1/2 + 1/3 + 1/4 + ... 1/n
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość: ");
        int input = scanner.nextInt();
        double result = calculateHarmonic(input);

//        for (int i = 1; i <= input; i++) {
//            result += 1d / i;
//        }
        System.out.println("Suma szeregu harmonicznego wynosi Hn=" + String.format("%.3f", result));
    }

    public static double calculateHarmonic(int input) {
        double result = 0;
        for (int i = 1; i <= input; i++) {
            result += 1d / i;
        }
        return result;
    }
}

