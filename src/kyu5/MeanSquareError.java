package kyu5;

//Complete the function that
//
//accepts two integer arrays of equal length
//compares the value each member in one array to the corresponding member in the other
//squares the absolute value difference between those two values
//and returns the average of those squared absolute value difference between each member pair.
//Examples
//[1, 2, 3], [4, 5, 6]              -->   9   because (9 + 9 + 9) / 3
//[10, 20, 10, 2], [10, 25, 5, -2]  -->  16.5 because (0 + 25 + 25 + 16) / 4
//[-1, 0], [0, -1]                  -->   1   because (1 + 1) / 2

public class MeanSquareError {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};

        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};

        int[] c1 = {0, -1};
        int[] c2 = {-1, 0};

        int[] d1 = {10, 10};
        int[] d2 = {10, 10};

        System.out.println(solution(a1, a2));
        System.out.println(solution(b1, b2));
        System.out.println(solution(c1, c2));
        System.out.println(solution(d1, d2));
    }


    public static double solution(int[] arr1, int[] arr2) {
        double solution = (double) 0;
        for (int i = 0; i < arr1.length; i++) {
                int absolute = Math.abs(arr1[i] - arr2[i]);
                System.out.println("absolute: " + absolute);
                solution+=Math.pow(absolute, 2);
        }
        return solution/arr1.length;
    }

}
