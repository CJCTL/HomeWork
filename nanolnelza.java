import java.util.Scanner;

public class nanolnelza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        double a = scan.nextDouble();
        System.out.println("Введіть друге число: ");
        double b = scan.nextDouble();

        double result = dilenya(a, b);
        System.out.println("Результат: " + result);
    }
    public static double dilenya(double a, double b) {
            try {
                if (b == 0) {
                    System.err.println("На нуль ділити не можна");
                    return 0;
                } else if ( a == 0 && b == 0) {
                    System.err.println("0 не ділиться на 0");
                    return 0;
                }
                return a / b;
            } catch (Exception exc) {
                System.err.println("Сталась помилка: " + exc.getMessage());
                return 0;
            }
    }
}
