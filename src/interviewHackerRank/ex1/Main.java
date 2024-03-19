package interviewHackerRank.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public void doo(){
        doo();
    }
    public static void main(String[] args) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        myList.add(List.of(0, 1));
//        myList.add(List.of(0, 3));
//        myList.add(List.of(4, 5));
//        myList.add(List.of(5, 6));
//        myList.add(List.of(4, 10));
//        myList.add(List.of(1, 17));
        System.out.println(findHardestWorkingNurse(myList));

    }


    static char findHardestWorkingNurse(List<List<Integer>> arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <=26; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ourList = arr.get(i);
            if (i==0){
                map.put(ourList.get(0), ourList.get(1));
            } else{
                List<Integer> previousShift = arr.get(i - 1);
                Integer hoursWorked = ourList.get(1) - previousShift.get(1);
                if(map.get(ourList.get(0))  < hoursWorked){
                    map.put(ourList.get(0), hoursWorked);
                }
            }
        }
        int max = 0;
        int maxIndex = map.get(0);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue() > max){
                max = integerIntegerEntry.getValue();
                maxIndex = integerIntegerEntry.getKey();
            }

        }
        return (char)(97+maxIndex);

    }
}
