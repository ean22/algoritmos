package palindromeNumber;

public class App {
    public static void main(String[] args){
        int num = 11211;

        System.out.println("""
                Número %d é Palindrome?:
                %b
                """.formatted(num, Solution.isPalindrome(num)));
    }
}

class Solution{
    public static boolean isPalindrome(int num){
        
        if(num < 0) return false;

        return checkPalindrome(String.valueOf(num));
    }

    private static boolean checkPalindrome(String num){
        int left = 0;
        int right = num.length() - 1;

        while(left < right){
            if(num.charAt(left) != num.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}
