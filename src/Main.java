import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     int [] SortArr = {12, 5, 77, 33, 4, 3, 13, 1, 23, 11, 2, 6};
     insertionSort(SortArr);
        System.out.println(Arrays.toString(SortArr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}