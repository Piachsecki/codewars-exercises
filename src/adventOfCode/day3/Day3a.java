package adventOfCode.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day3a {
    public static void main(String[] args) throws Exception {


        String testdata = """
vJrwpWtwJgWrhcsFMMfFFhFp
jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
PmmdzqPrVvPwwTWBwg
wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
ttgJtRGJQctTZtZT
CrZsJsPPZsGzwwsLwLmpwMDw
""";

        BufferedReader br = new BufferedReader(new FileReader("src/adventOfCode/day3/day3.txt"));

        int score = 0;

        String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        List<Set<Integer>> lists = new ArrayList<>();
        lists.add(new HashSet<>());
        lists.add(new HashSet<>());
        lists.add(new HashSet<>());
        int listIdx = 0;
        String line;
        while ((line = br.readLine()) != null) {
            //for (String line : testdata.split("\n")) {
            for (String e : line.split("")) {
                lists.get(listIdx).add(alphabet.indexOf(e));
            }
            listIdx++;
            if (listIdx < 3) {
                continue;
            }

            lists.get(0).retainAll(lists.get(1));
            lists.get(0).retainAll(lists.get(2));

            score += lists.get(0).stream().reduce((a, b) -> a + b).get();

            lists = new ArrayList<>();
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            lists.add(new HashSet<>());
            listIdx = 0;
        }
        System.out.println(score);
    }
}
