package javaPodstawyProgramowanie;

import java.util.Scanner;

/*
Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String), a następnie wypisuje
podany tekst, w którym każde słowo wypisane jest po dwa razy. Przykładowo, dla wejścia: „To jest mój test” program
powinien wypisać „To To jest jest mój mój test test”.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie do jąkania: ");
        String text = scanner.nextLine();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && word.length() == 0) {
            continue;
            } else if (text.charAt(i) == ' ') {
                word.append(" ").append(word);
                System.out.print(word);
                word = new StringBuilder();
            } else {
                word.append(text.charAt(i));
            }
        }
        System.out.print(word + " " + word);
    }
}
