package hackerrank.hackerrankInterviewPreparation.day2.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : a) {
            if(map.containsKey(integer)){
                map.replace(integer, map.get(integer) + 1);
            }else{
                map.put(integer, 1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue() == 1){
                return integerIntegerEntry.getKey();
            }
        }
        return 0;

    }

    //inne podejscie
    // public static int lonelyinteger(List<Integer> a) {
    //        while (!a.isEmpty()) {
    //            Integer current = a.get(0);
    //            a.remove(0);
    //            if (a.contains(current)) {
    //                a.remove(current);
    //            } else {
    //                return current;
    //            }
    //        }
    //        return 0;
    //    }
}
