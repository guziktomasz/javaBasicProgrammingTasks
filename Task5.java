package javaPodstawyProgramowanie;
/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i wypisze wszystkie liczby pierwsze,
większe od 1 i mniejsze od podanej liczby.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        for (int i = 2; i<number; i++) {
            int count = 0;
            for (int j = 2; j<i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
