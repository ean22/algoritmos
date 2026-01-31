package longestCommonPrefix;

public class App {
    public static void main(String[] args){
        String[] str = new String[] {"dog","dracecar","dcar"};

        Solution s = new Solution();

        System.out.println("longest common prefix: [" + s.longestCommonPrefix(str) + "]");
    }
}

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String str = "";
//         int minor = Integer.MAX_VALUE;
//         int letra = 0;
//         int palavra = 0;

//         for (String word : strs) {
//             if(word.length() < minor) minor = word.length();
//         }

//         for (letra = 0; letra < minor; letra++) {
            
//             char c = strs[0].charAt(letra);

//             for (palavra = 0; palavra < strs.length; palavra++) {
//                 if(strs[palavra].charAt(letra) != c) return str;

//             }
//             str = str.concat(String.valueOf(c));
//         }
  
//         return str;
//     }
// }


class Solution {
    public String longestCommonPrefix(String[] strs) {
        int letter = 0;
        int word = 0;
        int lastChar = smallerWord(strs);
        String prefix = "";

        for (letter = 0; letter < lastChar; letter++) {
            char c = strs[0].charAt(letter);

            for (word = 1; word < strs.length; word++) {
                if (c != strs[word].charAt(letter)) return prefix;
            }
            prefix = prefix.concat(String.valueOf(c));
        }

        return prefix;
    }

    private int smallerWord(String[] strs){
        int smaller = Integer.MAX_VALUE;

        for (String string : strs) {
            int stringSize = string.length();

            if (stringSize < smaller) smaller = stringSize;
        }

        return smaller;

    }
}

/*

flower
flow
flight

loop
    







*/