package poza;

public class Customer extends User {

    public Customer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Покупець";
    }

    public void makePurchase(String product) {
        System.out.println("Покупець " + getName() + "купує товар: " + product);
    }
}
