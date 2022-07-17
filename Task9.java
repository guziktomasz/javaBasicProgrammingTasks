package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i narysuje falę o zadanej długości
i wysokości 4 linijek, zgodnie z poniższym schematem (puste pola uzupełniaj spacjami): wzor
x      xx
 x    x  x
  x  x    x  x
   xx      xx
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość wzoru");
        int lenght = scanner.nextInt();
        System.out.println("Podaj wysokość wzoru");
        int height = scanner.nextInt();
        printer(lenght, height);
    }

    public static void printer (int lenght, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= lenght; j++) {
                if (j%(2*height) == i || ((2*height) - j%((2*height)) + 1) == i || (j%(2*height) == 0 && i == 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
    }
}
