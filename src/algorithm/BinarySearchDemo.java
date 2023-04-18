package algorithm;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 10, 12, 15, 20 };
        int index = BinarySearch(arr, 1);
        System.out.println(index);
    }

    public static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(true) {
            if(left > right){
                return -1;
            }
            int mid = (left + right) / 2;
            if(arr[mid] > target){
                right = mid - 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
    }
}
