package javaPodstawyProgramowanie;

import java.util.Arrays;

/*
Stwórz klasę Basket , która imituje koszyk sklepowy i przechowuje aktualną ilość elementów typu String w koszyku.
Dodaj metodę addToBasket(String product), która dodaje element do koszyka (zwiększając aktualny stan o 1 ) oraz
metodę removeFromBasket(String product), która usuwa element z koszyka (zmniejszając aktualny stan o 1. Koszyk
może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0
lub dodania przy stanie 10 wyswietl informacje, ze to niemozliwe
Zmodyfikuj program, tak aby zamiast obiektow typu String przechowywał obiekty klasy Product, ktore posiadaja
zmienne name, price, barcode
Dodaj dodatkowo metode calculatePrice() ktora obliczy cene produktow w koszyku i metode pay, ktora oprozni koszyk
z produktow i zwroci wartosc produktow w koszyku
Zaprezentuj dzialanie programu
 */
public class Basket {
    private String[] productBasket = new String[10];
    private int counter = 0;

    public boolean addToBasket (String product) {
        if (counter == 10) {
            System.out.println("Koszyk jest pełen");
            return false;
        }

        for (int i = 0; i < productBasket.length; i++) {
            if (productBasket[i] == null) {
                productBasket[i] = product;
                counter++;
                return true;
            }
        }
        return false;
    }

    public boolean removeFromBasket (String product) {
        if (counter == 0) {
            System.out.println("Koszyk jest pusty");
            return false;
        }

        for (int i = 0; i < productBasket.length; i++) {
            if (productBasket[i].equals(product)) {
                productBasket[i] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(productBasket);
    }
}
