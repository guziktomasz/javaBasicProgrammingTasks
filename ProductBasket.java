package javaPodstawyProgramowanie;

import java.util.Arrays;

public class ProductBasket {

    Product[] products = new Product[10];
    private int counter = 0;


    public boolean addToBasket (Product product) {
        if (counter == 10) {
            System.out.println("Koszyk jest pełen");
            return false;
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                counter++;
                return true;
            }
        }
        return false;
    }

    public boolean removeFromBasket (Product product) {
        if (counter == 0) {
            System.out.println("Koszyk jest pusty");
            return false;
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].equals(product)) {
                products[i] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

    public  int calculatePrice() {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
            sum = sum + products[i].getPrice();
        }
    }
        return sum;
    }

    public int pay() {
        int valueToPay = calculatePrice();
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        return valueToPay;
    }

    @Override
    public String toString() {
        return Arrays.toString(products);
    }
}
