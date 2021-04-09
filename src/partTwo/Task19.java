/*
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова
 * могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

package partTwo;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();
        char symbolOne;
        char symbolTwo;
        int n = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            symbolOne = str.charAt(i);
            symbolTwo = str.charAt(i + 1);
            if (symbolOne == ' ' && symbolTwo != ' ') {
                n++;
            }
        }

        System.out.println("Word count: " + n);
    }
}
