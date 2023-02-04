import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double numberTwo[] = {1.57, 7.654, 9.986};
        boolean[] plans = {true, false};
        System.out.println("Task2");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numberTwo.length; i++) {
            System.out.print(numberTwo[i]);
            if (i != numberTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < plans.length; i++) {
            System.out.print(plans[i]);
            if (i != plans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numberTwo.length - 1; i >= 0; i--) {
            System.out.print(numberTwo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = plans.length - 1; i >= 0; i--) {
            System.out.print(plans[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
