package algorithm;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        InsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertSort(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {//确定有序的数组
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {//开始排序无序的数组
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
