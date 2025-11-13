package poza;

public abstract class User {

    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract String getRole();

    public void showInfo() {
        System.out.println("Ім'я: " + name + ", Роль: " + getRole());
    }
}
