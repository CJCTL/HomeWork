package poza;

public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, boolean availabe, double discount) {
        super(name, price, availabe);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }

    public void printProductInfo() {
        super.printProductInfo();
        System.out.println("Знижка: " + discount + "%");
        System.out.println("Ціна зі знижкою: " + getDiscountedPrice() + " UAH");
    }
}
