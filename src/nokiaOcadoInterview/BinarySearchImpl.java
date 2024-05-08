package nokiaOcadoInterview;

import java.util.Arrays;

public class BinarySearchImpl<T extends Comparable<T>> {

    public static void main(String[] args) {
        BinarySearchImpl<Integer> binarySearchInteger = new BinarySearchImpl<>();
        Integer[] newArr = new Integer[]{1, 2, 5, 1, 3, -2, 5, 123, -2134, 2, 5, 3, 2 , 8, 1, 30, 3, 6};
        Arrays.sort(newArr);
        int i = binarySearchInteger.binarySearch(newArr, 123);
        int j = binarySearchInteger.binarySearchRecursive(newArr, 124, 0, 17);
        System.out.println(Arrays.toString(newArr));
        System.out.println(j);

    }




    public int binarySearch(T[] array, T key){
        int left = 0;
        int right = array.length-1;
        while (right>=left){
            int mid = left + ((right - left)/2);
            if(array[mid].equals(key)){
                return mid;
            } else if (array[mid].compareTo(key) > 0) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }


    public int binarySearchRecursive(T[] array, T key, int left, int right){
        while (right>=left){
            int mid = left + ((right - left)/2);
            if(array[mid].equals(key)){
                return mid;
            } else if (array[mid].compareTo(key) > 0) {
                return binarySearchRecursive(array, key, left,mid - 1 );
            }else {
                return binarySearchRecursive(array, key, mid + 1,right);
            }
        }
        return -1;
    }
}
