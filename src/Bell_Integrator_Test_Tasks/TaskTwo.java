package Bell_Integrator_Test_Tasks;

public class TaskTwo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1},
        };

        int n = arr.length - 1;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i][n] < min) {
                min =  arr[i][n];
            }
            n-=1;
        }

        System.out.println(min);




    }
}
