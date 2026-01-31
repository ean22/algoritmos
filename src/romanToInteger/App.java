package romanToInteger;

import java.util.Map;

public class App {
    public static void main(String[] args){
        String num = "MCMXCIV";

        System.out.println("""
                %s = %d
                """.formatted(num, Solution.romanToInt(num)));
    }
}

class Solution {
    static Map<Character,Integer> map = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );

    static public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        for (i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                sum -= current;
            } else sum += current;
        }

        sum += map.get(s.charAt(i));

        return sum;
    }
}

/*

MCMXCIV

*/