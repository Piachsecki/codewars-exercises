package kyu6;

import java.util.stream.IntStream;

public class CreatePhoneNumber {

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
//        StringBuilder sb = new StringBuilder();
//        String stringOfNumbers = Arrays.toString(numbers).replace(", ", "").replace("[", "").replace("]", "");
//
//        System.out.println(stringOfNumbers);
//       sb.append("(")
//                .append(stringOfNumbers.substring(0, 3))
//                .append(") ")
//                .append(stringOfNumbers.substring(3, 6))
//                .append("-")
//                .append(stringOfNumbers.substring(6));
//       return sb.toString();


        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());


    }
}
