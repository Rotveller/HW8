public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float[] numberTwo = {1.57f, 7.654f, 9.986f};
        int[] plans = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Task2");
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.printf("%s.", numbers[i]);
            } else {
                System.out.printf("%s,", numbers[i]);
            }
        }
        System.out.println();
        for (int t = 0; t < numberTwo.length; t++) {
            if (t == numberTwo.length - 1) {
                System.out.printf("%s.", numberTwo[t]);
            } else {
                System.out.printf("%s,", numberTwo[t]);
            }
        }
        System.out.println();
        for (int j = 0; j < plans.length; j++) {
            if (j == plans.length - 1) {
                System.out.printf("%s.", plans[j]);
            } else {
                System.out.printf("%s,", plans[j]);
            }
        }
        System.out.println();
        System.out.println("Task3");
        for (int i = 0; i < 0; i--) {
            if (i == i - 1) {
                System.out.printf("%s.", numbers[i]);
            } else {
                System.out.printf("%s,", numbers[i]);
            }
        }
        for (int t = 0; t > numberTwo.length - 1; t--) {
            if (t == numberTwo.length - 1) {
                System.out.printf("%s.", numberTwo[t]);
            } else {
                System.out.printf("%s,", numberTwo[t]);
            }
        }
        for (int j = 0; j > plans.length; j--) {
            if (j == plans.length - 1) {
                System.out.printf("%s.", plans[j]);
            } else {
                System.out.printf("%s,", plans[j]);
            }
        }
    }
}
