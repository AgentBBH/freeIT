/*
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)
 */

package trainingManualPartOne;

public class Task10 {
    public static void main(String[] args) {
        int lowerBorder = 10;
        int upperBorder = 15;
        int number = 1;

        for (int i = 2; i <= upperBorder; i++) {
            number *= i;
            if (i > lowerBorder - 1) {
                System.out.println("Factorial " + i + " = " + number);
            }
        }
    }
}
