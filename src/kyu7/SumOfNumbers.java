package kyu7;

//Given two integers a and b, which can be positive or negative,
// find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
//
//        Note: a and b are not ordered!
//
//        Examples (a, b) --> output (explanation)
//        (1, 0) --> 1 (1 + 0 = 1)
//        (1, 2) --> 3 (1 + 2 = 3)
//        (0, 1) --> 1 (0 + 1 = 1)
//        (1, 1) --> 1 (1 since both are same)
//        (-1, 0) --> -1 (-1 + 0 = -1)
//        (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
public class SumOfNumbers {

    public static void main(String[] args) {
        getSum(1 , 0);
        getSum(1 , 2);
        getSum(0 , 1);
        getSum(1 , 1);
        getSum(-1 , 0);
        getSum(-1 , 2);
    }

    public static int getSum(int a, int b) {
        int result = 0;
        boolean flag = a > b;
        if (flag) {
            for (int i = b; i <= a; i++) {
                result += i;
            }
        } else if (a == b) {
            return a;
        } else {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        }
        System.out.println(result);
        return result;
    }

}
