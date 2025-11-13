package poza;

public class Product {

    private String name;
    private double price;
    private boolean isAvailable;

    public Product(String name, double price, boolean  available) {
        this.name = name;
        this.price = price;
        this.isAvailable = available;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public void printProductInfo() { //DZ7-2
        System.out.println("Назва товару: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Наявність: " + (isAvailable ? "Є в наявності" : "Немає в наявності"));
    }
}

