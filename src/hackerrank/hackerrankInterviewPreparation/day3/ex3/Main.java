package hackerrank.hackerrankInterviewPreparation.day3.ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("There's-a-starman-waiting-in-the-sky", 3));
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.out.println(caesarCipher("Hello_Word!", 4));
    }

    private static String caesarCipher(String s, int k) {
        String finalString = "";

        k = k % 26;

        for (int i = 0; i < s.length(); i++) {

            int asciiCode = (int) s.charAt(i);

            if(asciiCode >= 65 && asciiCode <= 90)
                asciiCode = (asciiCode + k) > 90 ? 64 + (asciiCode + k) - 90 : (asciiCode + k);
            else if (asciiCode >= 97 && asciiCode <= 122)
                asciiCode = (asciiCode + k) > 122 ? 96 + (asciiCode + k) - 122 : (asciiCode + k);

            finalString = finalString.concat(String.valueOf((char) asciiCode));
        }

        return finalString;
    }
    }


//    public static String caesarCipher(String s, int k) {
//        char[] ourString = s.toCharArray();
//
//        for (int i = 0; i < ourString.length; i++) {
//            if (
//                    (
//                            (int) ourString[i] >= 97
//                                    && (int) ourString[i] + k <= 122
//                    )
//                            ||
//                            (
//                                    ourString[i] >= 65 && ourString[i] + k <= 90
//                            )
//            ) {
//                ourString[i] = (char) ((int) ourString[i] + k);
//            } else if (
//                    (
//                            (int) ourString[i] >= 97
//                                    && (int) ourString[i] + k > 122
//                    )
//            ) {
//                ourString[i] = (char) (97 + ourString[i] + k - 123);
//            }else if(
//
//                    ourString[i] >= 65 && ourString[i] + k > 90
//            ){
//                ourString[i] = (char) (65 + ourString[i] + k - 91);
//            }
//
//
//
//        }
//
//        return String.valueOf(ourString);
//    }

//}


//(
//                            (int) ourString[i] >= 97
//                                    && (int) ourString[i] + k <= 122
//                    )
//                            ||
//                            (
//                                    ourString[i] >= 65 && ourString[i] + k <= 90
//                            )
