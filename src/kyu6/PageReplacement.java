package kyu6;
//
//In a computer operating system that uses paging for virtual memory management,
//        page replacement algorithms decide which memory pages to page out when a page of memory needs to be allocated.
//        Page replacement happens when a requested page is not in memory (page fault) and a free page cannot be used to satisfy the allocation,
//        either because there are none, or because the number of free pages is lower than some threshold.
//
//        The LRU page replacement algorithm
//        The least recently used (LRU) page replacement algorithm works
//        on the idea that pages that have been most heavily used in the
//        past few instructions are most likely to be used heavily in the
//        next few instructions too. If not all the slots in memory are occupied,
//        the requested page is inserted in the first available slot when a page fault happens.
//        If the memory is full and a page fault happens, the least recently used page in memory gets replaced by the requested page.
//        To explain it in a clearer way: the least recently used page is the page that is currently in memory and has been referenced further in the past.
//
//        Your task is to implement this algorithm. The function will take two parameters as input:
//        the number of maximum pages that can be kept in memory at the same time n and a reference list containing numbers.
//        Every number represents a page request for a specific page (you can see this number as the unique ID of a page).
//        The expected output is the status of the memory after the application of the algorithm. Note that when a page is inserted in the memory,
//        it stays at the same position until it is removed from the memory by a page fault.
//
//        Example:
//        Given:
//
//        N = 3,
//        REFERENCE LIST = [1, 2, 3, 4, 3, 2, 5],
//        * 1 is read, page fault --> free memory available, memory = [1];
//        * 2 is read, page fault --> free memory available, memory = [1, 2];
//        * 3 is read, page fault --> free memory available, memory = [1, 2, 3];
//        * 4 is read, page fault --> LRU = 1, memory = [4, 2, 3];
//        * 3 is read, already in memory, nothing happens;
//        * 2 is read, already in memory, nothing happens;
//        * 5 is read, page fault --> LRU = 4, memory = [5, 2, 3].
//        So, at the end we have the list [5, 2, 3], which is what you have to return.
//        not all the slots in the memory get occupied after applying the algorithm,
//        fill the remaining slots (at the end of the list) with -1 to represent emptiness (note that the IDs will always be >= 1).


//my Solution

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PageReplacement {
    public static void main(String[] args) {
        lru(2, new int[]{2, 5, 3, 2, 5, 3});
    }


    public static int[] lru(int n, int[] referencesList) {
        if (n <= 0) {
            throw new RuntimeException("Wrong");
        }
        List<Integer> arr = new ArrayList<>(3);
        for (int i = 0; i <= n - 1; i++) {
            arr.add(i, -1);
        }
        System.out.println("arr after specifing n:" + arr);
        for (int j = 0; j < n; j++) {
            int element = referencesList[j];
            if(j == 0){
                arr.add(0, element);
            }

            if (!arr.contains(element)) {
                List<Integer> temp = new ArrayList<>(n);
                if (n == 1) {
                    arr.remove(0);
                    arr.add(0, element);
                    continue;
                } else if (n == 2 && !arr.get(1).equals(-1)) {
                    temp.add(0, arr.get(1));
                } else {

                    for (int i = 1; i <= n - 2; i++) {
                        temp.add(i, arr.get(i));
                    }
                    System.out.println("temp list: " + temp);
                }
                    arr.remove(0);
                System.out.println("After removal: " + arr);

                    arr.add(0, element);
                System.out.println("After adding new number at index 0: " + arr);

                arr.addAll(1, temp);
                System.out.println("arr after adding value" + arr);

            }


        }

        LinkedList<Integer> result = new LinkedList<>();


        return null;
    }


}
