package removeDuplicates;

public class App {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
        
        System.out.print("\nArray original: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        Solution s = new Solution();
        System.out.println("\nQuantidade de números únicos: " + s.removeDuplicates(arr));
        
        System.out.print("Array alterado: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueNum = nums.length;
        int current = nums[0];
        int indexA = 0, indexB = 1;


        for (int i : nums) {
            if (i == current) uniqueNum--;
            current = i;
        }

        // Ignora o decremento do indice 0;
        uniqueNum++;

        while (indexB < nums.length) {
            if (nums[indexA] != nums[indexB]) {
                nums[++indexA] = nums[indexB++];

            } else indexB++;
        }

        return uniqueNum;
    }
}
