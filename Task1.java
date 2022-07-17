package javaPodstawyProgramowanie;

import java.util.Scanner;

/*Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float)
i obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14, a następnie skorzystaj
z wbudowanej klasy Math i znajdującej się tam stałej PI.*/
public class Task1 {
    /*1 pobranie danych
    2 obliczenia
    3 wyświetlanie
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę ogręgu");
        float diameter = scanner.nextFloat();

        //System.out.println(diameter);
        //float PI = (float) Math.PI;
        //float circuit = perimeterCounting(diameter);
        //String roundedCircuit = String.format("%.2f",circuit);
        Task1_Circle task1_circle = new Task1_Circle(diameter);
        float circuit = task1_circle.getCircuit();
        System.out.println("circuit = " + circuit);
    }

    public static float perimeterCounting (float diameter) {
        float circuit = (float) (diameter * Math.PI);
        return  circuit;
    }

}
