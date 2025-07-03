package Bell_Integrator_Test_Tasks;

import java.util.Scanner;

public class TaskThree {

    public static int[][] addElementsInArray(int n) {
        int[][] arr = new int[n][n];

        int levels = n / 2; //количество уровней

        for (int level = 0; level < levels; level++) {
            int tempValue = levels - level - 1;

            for (int i = level; i < n - level; i++) {
                arr[level][i] = tempValue; // верхний уровень
                arr[i][level] = tempValue; // левый уровень
                arr[n - 1 - level][i] = tempValue; // нижний уровень
                arr[i][n - 1 - level] = tempValue; // правый уровень
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int a:arr[i]) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][]array = addElementsInArray(n);
        printArray(array);
    }
}

