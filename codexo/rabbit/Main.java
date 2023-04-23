package codexo.rabbit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/* входът с който работя
5-големината на градината
xx---
xx---
-----
---xx
---xx */
        int jump = 0;
        int rabbitRow = 0;
        int rabbitCol = 0;
//чета си входа
        int rows = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rows][rows];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().toCharArray();
        }
//по условие заекът влиза от ляво на градината и го маркирам на матрицата с буква R и вече е скочил да яде около него.
        matrix[rabbitRow][rabbitCol] = 'R';
        jump++;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
//засичам дали около заека има храна по вертикал и хоризонтал и по доагонал и скачам на следавщата позиция, като прескачам един ред и една колона.
//маркирам новата позиция с R. След това правя проверка дали е на изхода на градината и дали има около него храна и го изпращам да бяга по тъча.
// Обаче предполагам че имам проблем. Ако не сложа break  извъртането на цикъла на празният ред заека ми излиза извън матрицата
//и не мога да го оправя.
                if (matrix[row + 1][col] == 'x' && matrix[row][col + 1] == 'x' && matrix[row + 1][col + 1] == 'x') {
                    rabbitRow++;
                    rabbitCol++;
                    jump++;
                    rabbitRow = rabbitRow + 2;
                    rabbitCol = rabbitCol + 2;
                    matrix[rabbitRow][rabbitCol] = 'R';
                    if (rabbitCol+1 == matrix.length-1 &&
                            matrix[row + 1][col] == 'x' && matrix[row][col + 1] == 'x' && matrix[row + 1][col + 1] == 'x'){
                        printMatrix(matrix);
                        System.out.printf("Good bye,rabbit jump %d times!",jump);
                        break;
                    }

                    if (outOfGarden(rabbitRow, rabbitCol, matrix)) break;
                }

            }
            break;

        }

    }

    private static boolean outOfGarden(int rabbitRow, int rabbitCol, char[][] matrix) {
        if (rabbitCol+1 >= matrix.length || rabbitRow+1 >= matrix.length) {
            System.out.println("Rabbit is out?");
            return true;
        }
        return false;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

}
