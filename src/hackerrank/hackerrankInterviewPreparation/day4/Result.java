package hackerrank.hackerrankInterviewPreparation.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
    public static void main(String[] args) {
        System.out.println(gridChallenge(List.of("uxf", "vof", "hmp")));
    }

    public static String gridChallenge(List<String> grid) {

        List<char[]> list = new ArrayList<>();

        for (int i = 0; i < grid.get(0).length() - 1; i++) {
            char[] wordAsChars1 = grid.get(0).toCharArray();
            char[] wordAsChars2 = grid.get(i+1).toCharArray();
            Arrays.sort(wordAsChars1);
            Arrays.sort(wordAsChars2);
            for (int j = 0; j < grid.get(0).length(); j++) {

                if (wordAsChars1[j] >wordAsChars2[j] ) {
                    return "NO";
                }
                if (wordAsChars1[i] > wordAsChars1[i + 1]) {
                    return "NO";
                }
            }
        }

        return "YES";

        //   List<char[]> list = new ArrayList<>();
        //
        //        for (String word : grid) {
        //            char[] wordAsChars = word.toCharArray();
        //            Arrays.sort(wordAsChars);
        //            list.add(wordAsChars);
        //        }
        //
        //
        //        for (int i = 0; i <list.get(0).length - 1; i++) {
        //            for (int j = 0; j < grid.get(0).length(); j++) {
        //                if(grid.get(i).charAt(j) > grid.get(i+1).charAt(j)){
        //                    return "NO";
        //                }
        //            }
        //        }
        //
        //    return "YES";
//        for (String word : grid) {
//            char[] wordAsChars = word.toCharArray();
//            for (int i = 0; i < wordAsChars.length - 1; i++) {
//                if(wordAsChars[i] > wordAsChars[i+1]){
//                    return "NO";
//                }
//            }
//        }


    }
}
