package kyu6;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 6, 8, -10, 3}));
        System.out.println(find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[] {Integer.MAX_VALUE, 0, 1}));


    }


    static int find(int[] integers) {
        boolean isOdd = false;
        int count = 0;
        for (int integer : integers) {
            if (integer % 2 != 0) {
                count++;
            }
        }
        if (count > 1)
            isOdd = true;

        if(isOdd){
            return Arrays.stream(integers).boxed().filter(x->x%2 ==0).findFirst().get();
        }
        return Arrays.stream(integers).boxed().filter(x->x%2 !=0).findFirst().get();

    }
}
