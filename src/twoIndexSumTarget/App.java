package twoIndexSumTarget;

import java.util.HashMap;

public class App{
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] answer = Solution.twoIndexSumTarget(target, arr);

        try {
            System.out.print("index: [");
            for (int i : answer) {
                System.out.print(i + ", ");
            }
            System.out.println("]");

        } catch (NullPointerException e) {
            System.out.println("Target indexes not found");
        }
    }
}

class Solution{
    public static int[] twoIndexSumTarget(int target, int [] arr){
        HashMap<Integer, Integer> correlation = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i < arr.length; i++){
            correlation.put(target - arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(correlation.containsKey(arr[i])){
                answer[0] = correlation.get(arr[i]);
                answer[1] = i;

                return answer;
            }
        }
        
        return null;
    }
}