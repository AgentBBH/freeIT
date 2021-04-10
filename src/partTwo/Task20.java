/*
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */

package partTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();
        int n = 0;
        char symbolOne = str.charAt(0);
        char symbolTwo = str.charAt(1);

        for (int i = 1; i < str.length() - 1; i++) {
            if (symbolOne != ' ' && symbolTwo == ' ') {
                System.out.print(symbolOne);
            }
            symbolOne = str.charAt(i);
            symbolTwo = str.charAt(i + 1);
        }
        System.out.println(symbolTwo != ' '? symbolTwo : "");
    }
}
