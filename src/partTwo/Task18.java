/*
 * Найти в строке не только запятые, но и дргуие знаки препинания. Подсчитать общее их количество
 */

package partTwo;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();
        int n = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == '-') {
                n++;
            }
        }
        System.out.println("Number of punctuation marks: " + n);
    }
}
