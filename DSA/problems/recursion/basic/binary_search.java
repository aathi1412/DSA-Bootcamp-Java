
public class binary_search{
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12,45};
        int target = 9;
        int left = 0, right = arr.length-1;
        System.out.println(search(arr, target, left, right));
    }

    public static int search(int[] nums, int target, int left, int right){
        if(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) return search(nums, target, mid + 1, right);
            else return search(nums, target, left, mid - 1);
        }
        return -1;
    }
}