package realInterviewsTests;

import java.util.*;

public class Main {
    public static void main(String[] args) {
sort(List.of(4, 5, 6, 5, 4, 3, -2, 5, 12, 523, 64, 3, -214));
    }


    public static List<Integer> sort(List<Integer> items){
        List<Integer> finalArray = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for (Integer item : items) {
            if(!map.containsKey(item)){
                map.put(item, 1);
                continue;
            }
            map.put(item, map.get(item)+1);
        }
        System.out.println(map);

        map = sortHashMap(map);
        System.out.println(map);


        return null;
    }

    private static Map<Integer, Integer> sortHashMap(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort(new Comparator<>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Integer, Integer> temporary = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : entries) {
            temporary.put(entry.getKey(), entry.getValue());
        }

        return temporary;


    }
}
