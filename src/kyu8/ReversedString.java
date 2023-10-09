package kyu8;

//Complete the solution so that it reverses the string passed into it.
//
//        'world'  =>  'dlrow'
//        'word'   =>  'drow'

public class ReversedString {
    public static void main(String[] args) {
        solution("Kacper");


    }

    public static String solution(String str){
        char[] chars = str.toLowerCase().toCharArray();
        StringBuilder s= new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
//            System.out.println(chars[i]);
            s.append(chars[i]);
        }

//        System.out.println(s.toString());
        return s.toString();
    }

}
