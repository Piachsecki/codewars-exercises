package adventOfCode.day1;

/*
--- Day 1: Trebuchet?! ---
Something is wrong with global snow production,
 and you've been selected to take a look.
  The Elves have even given you a map; on it, they've used stars to mark the top fifty locations that are likely to be having problems.

You've been doing this long enough to know that to restore snow operations,
 you need to check all fifty stars by December 25th.

Collect stars by solving puzzles.
 Two puzzles will be made available on each day in the Advent calendar;
  the second puzzle is unlocked when you complete the first. Each puzzle grants one star.
   Good luck!

You try to ask why they can't just use a weather machine
("not powerful enough")
and where they're even sending you ("the sky")
 and why your map looks mostly blank ("you sure ask a lot of questions")
 and hang on did you just say the sky ("of course, where do you think snow comes from"
  when you realize that the Elves are already loading you into a trebuchet
  ("please hold still, we need to strap you in").

As they're making the final adjustments, they discover that their calibration document
(your puzzle input) has been amended by a very young
Elf who was apparently just excited to show off her art skills.
 Consequently, the Elves are having trouble reading the values on the document.

The newly-improved calibration document consists of lines of text;
 each line originally contained a specific calibration value that the Elves now need to recover.
  On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number.

For example:

1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet
In this example, the calibration values of these four lines are 12, 38, 15, and 77.
 Adding these together produces 142.

Consider your entire calibration document. What is the sum of all of the calibration values?
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        Path path = Path.of("./src/adventOfCode/day1/data.txt");
        try {
            List<String> stringList = Files.readAllLines(path);

            Long result = 0L;

            List<Long> twoAndMoreDigitsNumbers = stringList.stream()
                    .map(line -> {
                        String one = "one";
                        String two = "two";
                        String three = "three";
                        String four = "four";
                        String five = "five";
                        String six = "six";
                        String seven = "seven";
                        String eight = "eight";
                        String nine = "nine";
                        if (line.contains(one)){
                            System.out.println("ENTERED");
                            line = line.replace("one", "1");
                        }
                        if(line.contains(two)){
                            line = line.replace("two", "2");

                        }
                        if(line.contains(three)){
                            line = line.replace("three", "3");

                        }
                        if(line.contains(four)){
                            line = line.replace("four", "4");

                        }
                        if(line.contains(five)){
                            line = line.replace("five", "5");

                        }
                        if(line.contains(six)){
                            line = line.replace("six", "6");

                        }
                        if(line.contains(seven)){
                            line = line.replace("seven", "7");

                        }
                        if(line.contains(eight)){
                            line = line.replace("eight", "8");

                        }
                        if(line.contains(nine)){
                            line = line.replace("nine", "9");
                        }
                        return line;

                    })
                    .map(line -> Integer.parseInt(line.replaceAll("[\\D]", "")))
                    .map(String::valueOf)
                    .map(number -> {
                        return "" + number.substring(0, 1) + number.substring(number.length()- 1);
                    })
                    .map(Long::parseLong)
                    .peek(System.out::println)
                    .toList();

            for (Long twoAndMoreDigitsNumber : twoAndMoreDigitsNumbers) {
                result+=twoAndMoreDigitsNumber;
            }

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}
