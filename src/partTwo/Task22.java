/*
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java, с помощью
 * регулярных выражений и вывести их на страницу.
 */

package partTwo;

import java.util.Scanner;
import java.util.regex.*;

public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();
        Pattern regexp = Pattern.compile("[0-9a-fA-F]\\w+[0-9a-fA-F]+");
        Matcher m = regexp.matcher(str);
        System.out.println("Find number: ");
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
