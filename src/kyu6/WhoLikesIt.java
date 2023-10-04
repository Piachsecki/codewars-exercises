package kyu6;

//You probably know the "like" system from Facebook and other pages.
// People can "like" blog posts, pictures or other items.
// We want to create the text that should be displayed next to such an item.
//
//        Implement the function which takes an array containing the names of people that like an item.
//        It must return the display text as shown in the examples:
//
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//        Note: For 4 or more names, the number in "and 2 others" simply increases.


import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Kacper")
        );
        System.out.println(whoLikesIt("Kacper", "Wojtek")
        );
        System.out.println(whoLikesIt("Kacper", "Wojtek", "Maciek")
        );
        System.out.println(whoLikesIt("Kacper", "Wojtek", "Maciek", "Piotrek")
        );
//        whoLikesIt();
//        whoLikesIt("Kacper");
//        whoLikesIt("Kacper", "Wojtek");
//        whoLikesIt("Kacper", "Wojtek", "Maciek");
//        whoLikesIt("Kacper", "Wojtek", "Maciek", "Piotrek");
    }

    public static String whoLikesIt(String... names) {
        List<String> result = new ArrayList<>(List.of(names));
//        System.out.println(result);
        if (result.isEmpty()) {
            return "no one likes this";
        } else if (result.size() == 1) {
            return String.format("%s likes this", result.get(0));
        } else if (result.size() == 2) {
            return String.format("%s and %s like this", result.get(0), result.get(1));
        } else if (result.size() == 3) {
            return String.format("%s, %s and %s like this", result.get(0), result.get(1), result.get(2));
        }

        return String.format("%s, %s and %d others like this", result.get(0), result.get(1), result.size() - 2);

    }
}
