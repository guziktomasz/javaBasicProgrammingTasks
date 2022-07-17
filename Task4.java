package javaPodstawyProgramowanie;
/*Wypisz wszystkie liczby od 1 do 100, jednak jezeli liczba jest podzielna przez:
        trzy – wypisz „Fizz”,
        piec – wypisz „Buzz”,
        trzy i piec wypisz „FizzBuzz”.

 */
public class Task4 {
    public static void main(String[] args) {
        //1. Stworzyć pętle
        for (int i=1; i<=100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
