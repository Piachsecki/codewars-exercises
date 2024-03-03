package hackerrank.certificate.ex2;

import java.util.Arrays;

class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        String[] eachWord = sentence.trim().replaceAll(" +", " ").split(" ");
        System.out.println("split: " + Arrays.toString(eachWord));
        int stringCounter = 0;
        int intCounter = 0;
        int doubleCounter = 0;
        for (String word : eachWord) {
            if (word.charAt(0) >= '0' && word.charAt(0) <= '9') {
                if (word.contains(".")) {
                    doubleCounter++;
                    continue;
                } else {
                    intCounter++;
                    continue;
                }
            }
            stringCounter++;
        }

        System.out.println("string " + stringCounter);
        System.out.println("integer " + intCounter);
        System.out.println("double " + doubleCounter);

    }

}