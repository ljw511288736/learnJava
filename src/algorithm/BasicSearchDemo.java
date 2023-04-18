package algorithm;

public class BasicSearchDemo {
    public static void main(String[] args) {
        
    }

    public static boolean basicSearch(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
