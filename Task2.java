package javaPodstawyProgramowanie;

import java.util.Scanner;

/*Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie. Program powinien wczytywać od
        użytkownika dwie zmienne: wagę w kilogramach (typ float)
        oraz wzrost w centymetrach (typ int). B
        MI powinno zostać wyliczone zgodnie z poniższym wzorem:
        BMI = masa / wzrost^2
        Optymalny zakres BMI wynosi od 18.5 do 24.9,
        wartości mniejsze lub większe są wartościami nieoptymalnymi. T
        wój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę w kg: ");
        float weight = scanner.nextFloat();
        System.out.println("Podaj wzrost w cm: ");
        double height = (double) scanner.nextInt() / 100;
        //System.out.println("height = " + height);
        double resultBMI = countBMI(weight, height);
        System.out.println(resultBMI);
        String resultBMIif = checkBMI(resultBMI);
        System.out.println(resultBMIif);
    }

    public static double countBMI (float weight, double height) {
        double BMI = weight / (height*height);
        return BMI;
    }

    public static String checkBMI (double BMI){
        String result ="";
        if (BMI >=18.5 && BMI <=24.9){
            result = "BMI optymalne";
        } else {
            result = "BMI nieoptymalne";
        }
        return result;
    }

}
