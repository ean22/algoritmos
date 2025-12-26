package duplicateZeros;

public class App {
    public static void main(String[] args) {
        // int[] arr = {1,0,2,3,0,4,5,0};
        int[] arr = {0,4,1,0,0,8,0,0,3};
        Solution2.duplicateZeros(arr);
        
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

class Solution{
    public static void duplicateZeros(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length - 1; j > i; j--){
                    arr[j] = arr[j - 1];
                }
                
                if(i < 6) arr[i + 1] = 0;
                i++;
            }
        }
    }
}

class Solution2{
    public static void duplicateZeros(int[] arr){
        int countZero = 0;
        int j = 0;
        int[] arr2 = new int[arr.length]; 
        
        for (int i = 0; i < arr.length - countZero; i++) {
            if (arr[i] == 0){
                countZero++;
            }
        }

        for(int i = 0; i < arr.length - countZero; i++){
            if(arr[i] != 0){
                arr2[j] = arr[i];
            } else{
                arr2[j] = 0;
                arr2[j + 1] = 0;
                    
                j++;
            }

            j++;
        }

        for(int i = 0; i < arr.length; i++) arr[i] = arr2[i];
    }
}
