package kyu5;

//Take the following IPv4 address: 128.32.10.1
//
//        This address has 4 octets where each octet is a single byte (or 8 bits).
//
//        1st octet 128 has the binary representation: 10000000
//        2nd octet 32 has the binary representation: 00100000
//        3rd octet 10 has the binary representation: 00001010
//        4th octet 1 has the binary representation: 00000001
//        So 128.32.10.1 == 10000000.00100000.00001010.00000001
//
//        Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
//
//        Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
//
//        Examples
//        2149583361 ==> "128.32.10.1"
//        32         ==> "0.0.0.32"
//        0          ==> "0.0.0.0"


public class Int32ToIPv4 {
    public static void main(String[] args) {
        System.out.println(longToIP(4114225L));
//        System.out.println(longToIP(0L));
//        System.out.println(longToIP(2149583361L));
    }

    //optimal solution
    public static String longToIP(long ip) {
        return String.format("%d.%d.%d.%d", ip>>>24, (ip>>16)&0xff, (ip>>8)&0xff, ip&0xff);
    }



    //My solution
//    public static String longToIP(long ip) {
//        if(ip == 0){
//            return "0.0.0.0";
//        }
//        String s = Long.toBinaryString(ip);
//        System.out.println(s);
//        if(s.length() < 32){
//            for (int i = s.length(); i < 32 ; i++) {
//                s = "0" + s;
//            }
//        }
//        System.out.println(s);
//        String[] split = s.split("(?=(.{8})+$)");
////        System.out.println(Arrays.toString(split));
//        StringBuilder result = new StringBuilder();
//        int j = 0;
//        for (String binaryNumber : split) {
//            char[] chars = binaryNumber.toCharArray();
//            int binaryToIpV = 0;
//            int i=chars.length - 1;
//            for (char num : chars) {
//                if( num == '1'){
//                    binaryToIpV += Math.pow(2, i);
//                }
//                i--;
//            }
//            result.append(String.valueOf(binaryToIpV));
//            if(j != split.length - 1 ){
//                result.append(".");
//            }
//            j++;
//        }
//        return result.toString();
//    }

}
