import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int [] SortArr = new int[12];
     Scanner input = new Scanner(System.in);
     for(int i = 0; i < SortArr.length; i++){
         SortArr[i] = input.nextInt();
     }
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