package javaPodstawyProgramowanie;
/*
Napisz program realizujący prosty kalkulator. Program powinien:
a. pobrać pierwszą liczbę (typu float)
b. pobrać jeden ze znaków: + - / *
c. pobrać drugą liczbę (typu float)
d. zwrócić wynik pobranego działania
Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Błędny znak”. Jeśli wpisanego działania
nie da się zrealizować (tj. jest niezgodne z zasadami matematyki), to program powinien wypisać napis „Błąd”.

 */
//1. wszytać dane
//2. walidacja znaku działania i argumentów

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pobieranie danych
        System.out.println("Podaj pierwszą liczbę");
        final String input1 = scanner.nextLine(); //final oznacza że nie możemy przypisać innego obiektu do zmiennej
        float number1 = Float.valueOf(input1);
        //float number1 = Float.parseFloat(input1);

        System.out.println("Podaj jeden ze znaków + - / *");
        char sign = scanner.nextLine().charAt(0);

        System.out.println("Podaj drugą liczbę");
        String input2 = scanner.nextLine();
        float number2 = Float.valueOf(input2); //zamiana z Stringa na float

        //obliczanie

        float result = 0;
        boolean badSign = false; //flaga
        switch (sign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 ==0){
                    System.out.println("Nie dzielimy przez zero");
                    badSign = true;
                    } else {
                    result = number1 / number2;
                    }
                break;
                default:
                System.out.println("Niepoprawna komenda");
                badSign = true;

        }
        if (!badSign) {
            System.out.println("Wynik: " + result);
        }
    }}
