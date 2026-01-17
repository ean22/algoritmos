package romanToInteger;

import java.util.Map;
import java.util.Map;

public class App {
    public static void main(String[] args){
        String num = "XLIX";

        System.out.println("""
                %s = %d
                """.formatted(num, Solution.romanToInt(num)));
    }
}

// class Solution{
//     final static Map<Character, Integer> map = Map.of(
//        'I',1,
//        'V',5,
//        'X',10,
//        'L',50,
//        'C',100,
//        'D',500,
//        'M',1000
//     );

//     public static int romanToInt(String num){
//         int sum = 0;
//         int i;

//         for(i = 0; i < num.length() - 1; i++){
            
//             int actual = map.get(num.charAt(i));
//             int next = map.get(num.charAt(i + 1));
            
//             if(actual >= next){
//                 sum += actual;
//             } else sum -= actual;
//         }

//         sum += map.get(num.charAt(i));

//         return sum;
//     }
// }


class Solution {
    public int romanToInt(String s) {
        

        
        return 0;
    }
}