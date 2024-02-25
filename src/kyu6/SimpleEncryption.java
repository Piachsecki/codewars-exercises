package kyu6;

//
//Implement a pseudo-encryption algorithm which given a string S and an integer
// N concatenates all the odd-indexed characters of S with all the even-indexed characters of S,
// this process should be repeated N times.
//
//        Examples:
//
//        encrypt("012345", 1)  =>  "135024"
//        encrypt("012345", 2)  =>  "135024"  ->  "304152"
//        encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"
//
//        encrypt("01234", 1)  =>  "13024"
//        encrypt("01234", 2)  =>  "13024"  ->  "32104"
//        encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
//        Together with the encryption function, you should also implement a decryption function which reverses the process.
//
//        If the string S is an empty value or the integer N is not positive, return the first argument without changes.
//


public class SimpleEncryption {
    public static void main(String[] args) {
        System.out.println(encrypt("012345", 1));
    }

    public static String encrypt(final String text, final int n) {
        char[] array = text.toCharArray();
        String result = "";
        char[] temp = new char[array.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = j; k < array.length ; k++) {
                    if(k%2 != 0 && k!= j){
                        temp[j] = array[k + count];
                        break;
                    }else {
                        
                    }
                }

            }
            count ++;
            result = new String(temp);
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }



}
