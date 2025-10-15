public class Task3end {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 20, 33, 50};
        int target = 20;

        int result = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("Число знайдено на індексі: " + result);
        } else {
            System.out.println("Число не знайдено");
        }
    }
}




