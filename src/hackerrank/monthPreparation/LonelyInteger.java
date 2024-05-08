package hackerrank.monthPreparation;

import java.util.*;

public class LonelyInteger {

    public static void main(String[] args) {

        Object[] nestedarray1 = {5, 4, 2};
        Object[] nestedarray2 = {2, 4, nestedarray1, 2};
        Object[] arr = {2, 4, nestedarray2};






        List<? super Number>xd = new ArrayList<Object>();
        List<? extends Number>xd1 = new ArrayList<Integer>();
//        List<Object>xd2 = new ArrayList<Integer>();
//        List<Integer>xd3 = new ArrayList<Number>();
//        List<Number> xd4 = new ArrayList<Integer>();

//
//        ArrayList<Integer> my1 = getInts();
//        ArrayList<Integer> my2 = getYourInts();
//
//        for (Integer integer : my1) {
//            if(my2.contains(integer)){
//                return integer;
//            }
//        }










        for (Object o : arr) {
            if(o instanceof Integer){
                System.out.println("xd");
            }else {
//                System.out.println(o.size() + "");
            }
        }


    }

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> result = new HashSet<>();
        for (Integer integer : a) {
            if(result.contains(integer)){
                result.remove(integer);
                continue;
            }
            result.add(integer);
        }


        return result.stream().findFirst().get();
    }




    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next=null;
        }
    }

    class LinkedListeeee{
        Node head;
        public LinkedListeeee(){
            head = null;
        }


        public void delete(){
            if(head == null || head.next == null){
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;

        }


    }




}
