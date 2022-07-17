package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego
o wskazanym indeksie. Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą
liczbę Fibonacciego. Kolejne liczby Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb
Fibonacciego. Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        do {
            System.out.println("Podaj liczbę: ");
            index = scanner.nextInt();
            if (index < 1) {
                System.out.println("Podaj liczbę większą od 0");
            }
        } while (index < 1);
        Task7getResult task7getResult = new Task7getResult();
        System.out.println("Liczba Fibonacciego dla indeksu " + index + " wynosi: " + task7getResult.getResult(index));

    }
    
//    public static int getResult (int index){
//        int[] array = new int[index];
//        for (int i = 0; i < index; i++) {
//            if (i < 2) {
//                array[i] = 1;
//            } else {
//                array[i] = array[i - 1] + array[i - 2];
//            }
//        }
//        int result = array[index - 1];
//        return result;
//    }
}

