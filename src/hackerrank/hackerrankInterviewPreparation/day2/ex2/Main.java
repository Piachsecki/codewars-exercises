package hackerrank.hackerrankInterviewPreparation.day2.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
//        arr.add(List.of(0, 1, 2));
//        arr.add(List.of(3, 4, 5));
//        arr.add(List.of(6, 7, 8));

        arr.add(List.of(11, 2, 4));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(10, 8, -12));
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if(i == j){
                    leftDiagonal+=arr.get(i).get(j);
                }
                if(i+j == arr.size() - 1){
                    rightDiagonal+=arr.get(i).get(j);

                }
            }
        }
        System.out.println(leftDiagonal);
        System.out.println(rightDiagonal);
        return Math.abs(rightDiagonal-leftDiagonal);

    }


}
