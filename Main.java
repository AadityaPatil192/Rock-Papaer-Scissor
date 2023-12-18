import java.util.Scanner;

public class Main {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {10, 5, 9, 3, 4};
        
        // Call the sort method to sort the array
        sort(arr);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}