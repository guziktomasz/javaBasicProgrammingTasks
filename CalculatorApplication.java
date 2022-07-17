package javaPodstawyProgramowanie;
/*
Na podstawie metody add(int a, int b) zaimplementuj kolejne metody:
1. int subtract(int a, int b) - odejmowanie: a - b
2. int multiply(int a, int b) - mnożenie: a * b
3. double divide(int a, int b) - dzielenie: a / b
4. boolean isPositive(int a) - sprawdza, czy liczba jest dodatnia
5. boolean isNegative(int a) - sprawdza, czy liczba jest ujemna
6. boolean isOdd(int a) - sprawdza, czy liczba jest nieparzysta
7. int min(int a, int b) - zwraca mniejszą z liczb
8. int max(int a, int b) - zwraca większą z liczb
9. double average(int a, int b) - zwraca średnią z liczb
10. int power(int a, int x) - zwraca a
m
 (a do potęgi m)
Na podstawie powyższych metod, zaimplementuj 3 argumentowe wersje tych metod:
1. int add(int a, int b, int c)
2. int subtract(int a, int b, int c)
3. int multiply(int a, int b, int c)
4. double divide(int a, int b, int c)
5. int min(int a, int b, int c)
6. int max(int a, int b, int c)
7. double average(int a, int b, int c)
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 12));
        System.out.println(calc.multiply(5, 12));
    }
}
