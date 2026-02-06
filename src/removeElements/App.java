package removeElements;

public class App {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
    
        Solution s = new Solution();
    
        System.out.println("Quantidade de elementos diferentes: " + s.removeElement(arr, val));
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }


}

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length;


        while (left <= right){
            if (nums[left] == val) {
                k--;
                if (nums[right] != val) {
                    nums[left++] = nums[right];
                    nums[right--] = val;
                } else right--;
            } else {
                left++;
            }
        }
        return k;
    }
}