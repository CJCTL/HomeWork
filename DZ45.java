package poza;

public class ACTUALEXPECTED {
    public static void main(String[] args) {
        String expected = "Login successful";

        String actual = "Login successful";

        if (expected.equals(actual)) {
            System.out.println("Тест пройден ");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}
