package tictactoe;

import java.util.Scanner;

public class Ticktacktoe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] field = new int[3][3];
        boolean flag = true;
        int x1, y1;
        int x2, y2;
        int countMove = 0;

        while (flag) {
            System.out.println("First player: ");
            System.out.println("x = ");
            x1 = in.nextInt() - 1;
            System.out.println("y = ");
            y1 = in.nextInt() - 1;
            countMove++;
            System.out.println("Second player: ");
            System.out.println("x = ");
            x2 = in.nextInt() - 1;
            System.out.println("y = ");
            y2 = in.nextInt() - 1;
            countMove++;

            if (field[x1][y1] == 0) {
                field[x1][y1] = 1;
            } else {
                System.out.println("Cell is busy");
            }
            if (field[x2][y2] == 0) {
                field[x2][y2] = 2;
            } else {
                System.out.println("Cell is busy");
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (field[i][j] == 0) {
                        System.out.print("* ");
                    }
                    if (field[i][j] == 1) {
                        System.out.print("O ");
                    }
                    if (field[i][j] == 2) {
                        System.out.print("X ");
                    }

                }
                System.out.println();
            }
            if ((field[1][0] != 0 && field[1][1] != 0 && field[1][2] != 0 && field[1][0] == field[1][1] && field[1][1] == field[1][2]) ||
                    (field[0][0] != 0 && field[1][0] != 0 && field[2][0] != 0 && field[0][0] == field[1][0] && field[1][0] == field[2][0]) ||
                    (field[0][0] != 0 && field[1][1] != 0 && field[2][2] != 0 && field[0][0] == field[1][1] && field[1][1] == field[2][2]) ||
                    (field[0][2] != 0 && field[1][1] != 0 && field[2][0] != 0 && field[0][2] == field[1][1] && field[1][1] == field[2][0])) {
                System.out.println("Game over! Win player " + field[1][1]);
                flag = false;
            } else if ((field[0][0] != 0 && field[0][1] != 0 && field[0][2] != 0 && field[0][0] == field[0][1] && field[0][1] == field[0][2]) ||
                    (field[0][1] != 0 && field[1][1] != 0 && field[2][1] != 0 && field[0][1] == field[1][1] && field[1][1] == field[2][1])) {
                System.out.println("Game over! Win player " + field[0][0]);
                flag = false;
            } else if ((field[2][0] != 0 && field[2][1] != 0 && field[2][2] != 0 && field[2][0] == field[2][1] && field[2][1] == field[2][2]) ||
                    (field[0][2] != 0 && field[1][2] != 0 && field[2][2] != 0 && field[0][2] == field[1][2] && field[1][2] == field[2][2])) {
                System.out.println("Game over! Win player " + field[2][2]);
                flag = false;
            } else if (countMove > 9) {
                System.out.println("Game over! No winner!");
                flag = false;
            }
        }
    }
}
