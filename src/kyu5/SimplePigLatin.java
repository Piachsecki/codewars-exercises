package kyu5;
//Move the first letter of each word to the end of it,
// then add "ay" to the end of the word.
// Leave punctuation marks untouched.
//
//        Examples
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !


public class SimplePigLatin {
    public static void main(String[] args) {
        pigIt("Pig latin is cool");
        pigIt("Hello world !");
    }

    public static String pigIt(String str) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (String s : split) {
            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                sb.append(chars[i]);
            }
            if(chars[0] == '!' || chars[0] == '.' || chars[0] == '?'){
                sb.append(chars[0]);
                continue;
            }
            sb.append(chars[0]).append("ay");
            if(j != split.length - 1){
                sb.append(" ");
            }
            j++;
        }
        System.out.println(sb);
        return sb.toString();
    }
}
