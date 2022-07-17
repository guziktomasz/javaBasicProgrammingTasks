package javaPodstawyProgramowanie;

public class ProductBasketApp {
    public static void main(String[] args) {
        Product milk = new Product("milk", 3, "99933332");
        Product butter = new Product("butter", 6, "99223332");
        Product bread = new Product("bread", 4, "11233332");
        ProductBasket productBasket = new ProductBasket();
        productBasket.addToBasket(milk);
        productBasket.addToBasket(butter);
        productBasket.addToBasket(bread);
        System.out.println(productBasket);
        //productBasket.removeFromBasket(product1);
        //System.out.println(productBasket);
        //Product product2 = new Product("milk", 3, "99933332");
        //productBasket.removeFromBasket(product2);
        System.out.println("Do zapłaty: " + productBasket.calculatePrice());
        System.out.println("Do zapłaty: " + productBasket.calculatePrice());
        System.out.println("Zapłacono: "+ productBasket.pay());
        System.out.println(productBasket);

    }
}
