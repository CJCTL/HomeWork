package poza;

public class InStore {
    public static void main(String [] args) {
        Product phone = new Product("Телефон", 33000.0, true);
        Product laptop = new Product("Ноутбук", 29000.0, false);
         phone.printProductInfo();
         laptop.printProductInfo();
    }
}
