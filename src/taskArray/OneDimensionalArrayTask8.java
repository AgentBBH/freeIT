/*
 * Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
 * массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
 * массива должен равняться отношению элемента из первого массива с i-ым
 * индексом к элементу из второго массива с i-ым индексом. Вывести все три
 * массива на экран (каждый на отдельной строке), затем вывести количество
 * целых элементов в третьем массиве.
 */

package taskArray;

import java.util.Random;

public class OneDimensionalArrayTask8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int[] arrayOneInt = new int[n];
        int[] arrayTwoInt = new int[n];
        double[] arrayDouble = new double[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            arrayOneInt[i] = rand.nextInt(9);
            arrayTwoInt[i] = rand.nextInt(9);
            if (arrayTwoInt[i] != 0) {
                arrayDouble[i] = (double) arrayOneInt[i] / arrayTwoInt[i];
            } else {
                arrayDouble[i] = 0;
            }
            if (arrayOneInt[i] % arrayTwoInt[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrayOneInt[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arrayTwoInt[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", arrayDouble[i]);
        }

        System.out.println();
        System.out.println("Number of integer: " + count);
    }
}