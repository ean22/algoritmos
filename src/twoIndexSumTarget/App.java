package twoIndexSumTarget;

import java.util.HashMap;

public class App{
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;

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
gi

class Solution2{
    public static int[] twoIndexSumTarget(int target, int [] arr){
        int[] a = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if( arr[i] + arr[j] == target && i != j){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }


        return a;
    }
}

/*
2,7,11,15
9

1 2  3  4
7 2 -2 -6



*/