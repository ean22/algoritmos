package palindromeNumber;

public class App {
    public static void main(String[] args){
        int num = 112111;

        Solution s = new Solution();

        System.out.println("""
                Número %d é Palindrome?:
                %b
                """.formatted(num, s.isPalindrome(num)));
    }
}

// class Solution{
//     public static boolean isPalindrome(int num){
        
//         if(num < 0) return false;

//         return checkPalindrome(String.valueOf(num));
//     }

//     private static boolean checkPalindrome(String num){
//         int left = 0;
//         int right = num.length() - 1;

//         while(left < right){
//             if(num.charAt(left) != num.charAt(right)) return false;

//             left++;
//             right--;
//         }

//         return true;
//     }
// }


class Solution {
    public boolean isPalindrome(int x) {
        char[] charArr = String
                .valueOf(x)
                .toCharArray();
        int left, right;
        left = 0;
        right = charArr.length - 1;

        for (left = 0; left <= right; left++) {
            if(charArr[left] != charArr[right]){
                return false;
            }

            right--;
        }
        return true;
    }
}
