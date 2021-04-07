/*
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
package lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = in.nextInt();
        System.out.println("Input B: ");
        int b = in.nextInt();
        int result = 0;
        boolean flagOne = true;
        boolean flagTwo = true;

        if (a < 0) {
            flagOne = false;
            a *= -1;
        }
        if (b < 0) {
            flagTwo = false;
            b *= -1;
        }

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println("Result: " + ((flagOne == flagTwo) ? result : -1 * result));
    }
}
