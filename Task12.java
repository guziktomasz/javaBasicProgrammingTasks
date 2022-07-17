package javaPodstawyProgramowanie;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String textShort;
        textShort = text.replace(" ", "");
        double textL = (double) (text.length());
        double textShortL = (double) (textShort.length());
        double participation = ((textL - textShortL) / textL) * 100 ;

        System.out.println("text.length() = " + text.length());
        System.out.println("textShort.length() = " + textShort.length());
        System.out.println("Udział spacji w całym tekście = " + String.format("%.0f", participation) + "%");
    }
}
