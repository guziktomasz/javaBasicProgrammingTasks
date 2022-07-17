package javaPodstawyProgramowanie;

public class BasketApp {
    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.addToBasket("butter");
        basket1.addToBasket("milk");
        basket1.addToBasket("milk");
        basket1.addToBasket("sugar");
        basket1.addToBasket("milk");
        System.out.println(basket1);
        basket1.removeFromBasket("milk");
        System.out.println(basket1);
        basket1.addToBasket("sugar");
        basket1.addToBasket("coffe");
        System.out.println(basket1);

        if (basket1.addToBasket("milk")) {
            System.out.println("Udało się dodać");
        } else {
            System.out.println("Nie udało się dodać");
        }

        System.out.println(basket1);

    }
}
