package javaPodstawyProgramowanie;

import java.util.Scanner;

// Sprawdzamy czy wyrażenie jest palindromem

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolne wyrażenie");
        String phrase = scanner.nextLine();

        if (isPalindrome(phrase)) {
            System.out.println("Podane wyrażenie jest palindromem !!!");
        } else {
            System.out.println("Podane wyrażenie nie jest palindromem");
        }

    }

    public static boolean isPalindrome(String phrase) {

        String changedPhrase = phrase.toLowerCase().replace(" ", "");
        boolean result = true;
        for (int i = 0; i < changedPhrase.length() / 2; i++) {
            if (changedPhrase.charAt(i) != changedPhrase.charAt(changedPhrase.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
