package realInterviewsTests;

import java.util.List;

public class BinarySearchTree {
    static void foo(int number, List<String> list, String str){
        number+=7;
        list.add("B");
        str+= "ma kota";
    }
 

    public static void main(String[] args)
    {
//        List<String> list = new ArrayList<String>(){{
//            add("A");
//        }};
//
//        int number = 2;
//        String str = "Ala";
//
//        foo(number, list, str);
//        System.out.println(number);
//        System.out.println(list);
//        System.out.println(str);


        for (int i = 0; i < 6; i++) {
            if( i / 2 == 0){
                continue;
            }

            if (i% 5 == 4){
                break;
            }

            System.out.println(i);
        }




    }
}