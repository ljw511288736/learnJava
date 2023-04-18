package algorithm;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };// {3,1,2,5,4,6,9,7,10,8}
        // (1,2,6,7,3,4,5,9,8,10);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
