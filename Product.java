package javaPodstawyProgramowanie;

public class Product {
    private String name;
    private int price;
    private String barCode;

    public Product(String name, int price, String barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
