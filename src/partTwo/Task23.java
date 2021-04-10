/*
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
 * например <p id="p1">, и замену их на простые теги абзацев <p>
 */

package partTwo;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = in.nextLine();
        Pattern regexp = Pattern.compile("<([a-z]\\s[a-z]{2}=.[a-z][0-9].)>");
        Matcher m = regexp.matcher(str);
        str = str.replaceAll(String.valueOf(regexp), "<p>");
        System.out.println("New string: ");
        System.out.println(str);
    }
}
