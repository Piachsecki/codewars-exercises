package nokiaOcadoInterview.ex5;

import java.util.*;

public class UniqueString {

    public static void main(String[] args) {
        String stringToCheck = "stringToCheck";
        Set<String> strings = returnUniqueStrings(stringToCheck);
        List<String> stringList = returnUniqueStringsDifferent(stringToCheck);
        System.out.println(strings);
        System.out.println(stringList);


    }

    private static  Set<String> returnUniqueStrings(String stringToCheck) {
        String[] ourStringAsArray = stringToCheck.trim().toLowerCase().split("");
        Set<String> result = new HashSet<>(Arrays.asList(ourStringAsArray));
        return result;
    }



    private static  List<String> returnUniqueStringsDifferent(String stringToCheck) {
        String[] stringAsArray = stringToCheck.trim().toLowerCase().split("");
        //map -> value!=0 'string' - 'integer' - ilosc przechowywanych liter
        //List<String> list.contains()
        List<String> result = new ArrayList<>();
        for (String s : stringAsArray) {
            if(result.contains(s)){
                result.remove(s);
                continue;
            }
            result.add(s);
        }


        return result;

    }



}
