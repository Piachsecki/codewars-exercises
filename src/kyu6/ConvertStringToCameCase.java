package kyu6;
//Complete the method/function so that it converts dash/underscore
// delimited words into camel casing. The first word within the output
// should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).
// The next words should be always capitalized.
public class ConvertStringToCameCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }


    static String toCamelCase(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 95 || chars[i] == 45){
                if(chars[i] >= 65 && chars[i] <= 90)
                    continue;

                chars[i+1] = (char) ((int)chars[i]+32);
                chars[i] = ' ';
            }
        }
        System.out.println(chars);
        System.out.println(String.valueOf(chars).trim());



        return  null;
    }
}
