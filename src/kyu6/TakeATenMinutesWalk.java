package kyu6;

import java.util.HashMap;
import java.util.Map;

public class TakeATenMinutesWalk {

    public static void main(String[] args) {

    }

    public static boolean isValid(char[] walk) {

        Map<Character, Integer> map = new HashMap<>();

        if(walk.length != 10){
            return false;
        }
        for (char character :walk){
            if(!map.containsKey(character)){
                map.put(character, 1);
                continue;
            }
            map.put(character, map.get(character) + 1);
        }
        if(map.get('n') != map.get('s') || map.get('w') != map.get('e')){
            return false;
        }


        return true;
    }

}
