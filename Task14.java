package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char) i wyliczy,
ile znaków stoi w alfabecie pomiędzy podanymi literami. Podpowiedź – skorzystaj z tablicy kodów ASCII
i traktuj znaki jak liczby int.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą mała literę: ");
        char firstChar = scanner.next().charAt(0);
        System.out.println("Podaj drugą mała literę: ");
        char secondChar = scanner.next().charAt(0);
        System.out.println("Odległość pomiędzy literami wynosi: " + charDistance(firstChar,secondChar));
    }

    public static int charDistance (char first, char second) {
        if (first == second) {
            return 0;
        } else {
            return Math.abs(first - second) - 1;
            //int distance = Math.abs(first - second) - 1;
            //return distance;
        }
   }
}
