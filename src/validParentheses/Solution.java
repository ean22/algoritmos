package validParentheses;

import java.util.Stack;

class App {
    public static void main( String[] args ){
        String s = "{()[]}";

        Solution r = new Solution();

        System.out.println(r.isValid(s));
    }
}

class Solution {
    public boolean isValid( String s ) {
        Stack<Character> stack = new Stack<>();

        for ( char c: s.toCharArray() ) {
            if ( c == '(' || c == '{' || c == '[' ){
                stack.add(c);

            } else if( !stack.isEmpty() && c == ')' && stack.peek() == '(' ) {
                stack.pop();
            
            } else if ( !stack.isEmpty() && c == '}' && stack.peek() == '{' ) {
                stack.pop();

            } else if ( !stack.isEmpty() && c == ']' && stack.peek() == '[' ) {
                stack.pop();

            } else return false;
        }

        return stack.isEmpty();
        
    }
}


