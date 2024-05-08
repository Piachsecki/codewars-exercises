package nokiaOcadoInterview;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] tab = new int[]{-2, 5, 10, -123, 3 ,12, 2, 1325, 2, 52342, -234234, -1, 3452, -65, 223 , 23, 53, 1, 6,23 , 5, 62};
        quickSort(tab, 0, tab.length);
        System.out.println(Arrays.toString(tab));
    }
    public static void quickSort(int[] tab, int l, int p) {
        if (l >= p) return;
        int m = partition(tab, l, p);
        quickSort(tab, l, m);
        quickSort(tab, m + 1, p);
    }

    // Metoda dzieląca tablicę i zwracająca indeks pivotu
    public static int partition(int[] tab, int left, int right) {
        int pivot = tab[left];
        int l = left;
        int r = right;
        while (true) {
            while (l < right && tab[l] < pivot) l++;
            while (r > left && tab[r] > pivot) r--;
            if (l < r) {
                swap(tab, l, r);
                l++;
                r--;
            } else {
                return r;
            }
        }
    }

    // Metoda do zamiany elementów w tablicy
    private static void swap(int[] tab, int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];

    }

}
