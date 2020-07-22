package blog.ex.lombok;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 13, 6, 5, 12, 15, 23, 17, 19, 10};
        System.out.println(solution(17, arr));
    }

    private static int solution(int target, int[] arr){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;
        int mid = 0;

        while (left < right){
            mid = (left + right) / 2;

            if(target == arr[mid]){
                return arr[mid];
            }
            if(target < arr[mid]) {
                right = mid -1;
            }else if(target > arr[mid]){
                left = mid +1;
            }
        }
        return -1;
    }
}
