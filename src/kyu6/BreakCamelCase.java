package kyu6;


//Complete the solution so that the function will break up camel casing, using a space between words.
//        Example
//        "camelCasing"  =>  "camel Casing"
//        "identifier"   =>  "identifier"
//        ""             =>  ""
public class BreakCamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));

    }


    //how the solution should look like:
    public static String camelCase(String string){
        return string.replaceAll("([A-Z])", " $1");
    }



    //My solution:

//
//    public static String camelCase(String input) {
//        StringBuilder sb = new StringBuilder();
//        String[] split = input.split("");
//
//        outer:
//        for (int i = 0; i < split.length; i++) {
//            for (int j = 65; j <= 90; j++) {
//                if(split[i].equals(String.valueOf((char) j))){
//                    sb.append(" " + (char) j);
//                    continue outer;
//                }
//            }
//            sb.append(split[i]);
//        }
//
//        System.out.println(sb.toString());
//
//        return sb.toString();
//    }

}
