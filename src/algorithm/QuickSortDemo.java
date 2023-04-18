package algorithm;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };// {3,1,2,5,4,6,9,7,10,8}
        quickSort(arr, 0, arr.length - 1);
        // int start = 1;
        // int end = arr.length - 1;
        // int baseNumber = arr[0];
        // while (end > start) {
        // while (arr[end] >= baseNumber && end > start) {
        // end--;
        // }
        // while (arr[start] <= baseNumber && end > start) {
        // start++;
        // }
        // swap(arr, start, end);
        // }
        // if (end == start) {
        // swap(arr, end, 0);
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(right < left){
            return;
        }
        int start = left;
        int end = right;
        int baseNumber = arr[left];
        while (start != end) {
            while (arr[end] >= baseNumber && end > start) {
                end--;
            }
            while (arr[start] <= baseNumber && end > start) {
                start++;
            }
            swap(arr, start, end);
        }
        swap(arr, left, start);
        quickSort(arr, left, end - 1);
        quickSort(arr, start + 1, right);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
