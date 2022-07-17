package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program służący do rozwiązywania równania kwadratowego. Program powinien pobrać trzy liczby całkowite
(współczynniki równania kwadratowego a, b, c) i wyliczyć pierwiastki x1, x2 równania wzor.
ax2 + bx + c = 0
Jeśli delta ∆ wyjdzie ujemna, wypisz „Delta ujemna” i zakończ program.
Potrzebne wzory:
wzor
delta = b2 - 4ac
x1 = (-b-delta)/2a
x2 = (-b+delta)/2a
 */
public class Task3 {
    public static void main(String[] args) {

        //Pobranie wartości a, b, c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj c: ");
        int c = scanner.nextInt();

        //Obiczenie delty
        int delta = (int) Math.pow(b, 2) - (4 * a * c);
        System.out.println("Delta wynosi: " + delta);

        if (delta > 0) {
            double x1 = ((-b - Math.sqrt(delta)) / 2 * a);
            double x2 = ((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Brak rozwiązań - delta < 0");
        }
    }

    //public static float delta (int a, int b, int c){

    //}
}
