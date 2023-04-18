package algorithm;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8, 10, 9 };// {3,1,2,5,4,6,9,7,10,8}
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
