package longestCommonPrefix;

public class App {
    public static void main(String[] args){
        String[] str = new String[] {"dog","racecar","car"};

        Solution s = new Solution();

        System.out.println("longest common prefix: [" + s.longestCommonPrefix(str) + "]");
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int minor = Integer.MAX_VALUE;
        int letra = 0;
        int palavra = 0;

        for (String word : strs) {
            if(word.length() < minor) minor = word.length();
        }

        for (letra = 0; letra < minor; letra++) {
            
            char c = strs[0].charAt(letra);

            for (palavra = 0; palavra < strs.length; palavra++) {
                if(strs[palavra].charAt(letra) != c) return str;

            }
            str = str.concat(String.valueOf(c));
        }
  
        return str;
    }
}

/*

flower
flow
flight

loop
    







*/