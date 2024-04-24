package hackerrank.monthPreparation;

public class FlipToBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(9L ));
        System.out.println(flippingBits(2147483647L ));
        System.out.println(flippingBits(1L ));
        System.out.println(flippingBits(0L ));
    }


    public static long flippingBits(long n) {
        String s = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int paddingLength = 32 - s.length();
        StringBuilder paddedBinary = new StringBuilder();
        for (int i = 0; i < paddingLength; i++) {
            paddedBinary.append('0');
        }
        paddedBinary.append(s);
        String[] split = paddedBinary.toString().split("");
        for (String bit : split) {
            if("1".equals(bit)){
                sb.append("0");
            }else {
                sb.append("1");
            }
        }

        return Long.parseLong(sb.toString(), 2);
    }
}
