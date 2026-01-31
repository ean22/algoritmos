package twoIndexSumTarget;

import java.util.HashMap;
import java.util.Map;

public class App{
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;

        int[] answer = Solution.twoSum(arr, target);

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
    public static int[] twoSum(int [] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            } else map.put(arr[i], i);
    
        }

        return null;
    }
} 

/*
atual + x = target
x = target - atual

map(atual, indice)

loop -> map.contains(x)?
    sim -> return (i, map.get(x))
    não -> map.put(atual, i)

*/