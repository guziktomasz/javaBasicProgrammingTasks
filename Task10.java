package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr
podanej liczby. Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę z dzielenia
liczby przez 10 (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10
(żeby „przesuwać” się do kolejnej cyfry).
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();
        //int number = 100;
        int sum = 0;
//        System.out.println("number = " + number);
//        int rest1 = number%10;
//        System.out.println("rest1 = " + rest1);
//        number = number / 10;
//        System.out.println("number = " + number);
//        int rest2 = number%10;
//        System.out.println("rest2 = " + rest2);
//        number = number / 10;
//        System.out.println("number = " + number);
//        int rest3 = number%10;
//        System.out.println("rest3 = " + rest3);
//        number = number / 10;
//        System.out.println("number = " + number);

        while (number>0){
            sum = sum + (number%10);
            number = number / 10;
        }
        System.out.println("suma = " + sum);

    }
}
