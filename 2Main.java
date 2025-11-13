package poza;

import java.util.concurrent.CompletionStage;

public class Main {
    public static void main(String [] args) {

        User admin = new Admin("Oleh");
        User custumer = new Customer("Andrey");

        User[] users = {admin, custumer};

        for (User user : users) {
            user.showInfo();

            if (user instanceof Admin) {
                System.out.println("Це адміністратор. Він може видаляти користувачів. ");
                ((Admin) user).deleteUser("Evgeniy");
            } else if (user instanceof Customer) {
                System.out.println("Це покупець. Він може купувати товари. ");
                ((Customer) user).makePurchase("Ноутбук");
            }
        }
    }
}
