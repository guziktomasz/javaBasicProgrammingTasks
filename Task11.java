package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów
(nie biorąc pod uwagę tekstu „Starczy”).
Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
 */
public class Task11 {

    public static final String KOMUNIKAT_BRAK_TEKSTU = "Nie podano żadnego tekstu";

    public static void main(String[] args) {
        String exit = "Starczy";
        Scanner scanner = new Scanner(System.in);
        String result = "";
        String text = "";
        String longertext = "";
        do {
            System.out.println("Podaj text: ");
            text = scanner.nextLine().trim();
            if (exit.equalsIgnoreCase(text.trim())) {
                break;
            } else if (text.isEmpty()) {
                System.out.println(KOMUNIKAT_BRAK_TEKSTU);
            } else {
                System.out.println("Podany tekst: " + text);
            }

            if (text.length() > result.length()) {
                result = text;
            }

        } while (true);

        if (result.isEmpty()) {
            System.out.println(KOMUNIKAT_BRAK_TEKSTU);
        } else {
            System.out.println("Najdłuzszy tekst: " + result);
        }
        System.out.println("Koniec programu");

    }
}
