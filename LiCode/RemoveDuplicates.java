package LiCode;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek().equals(c)) {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        String s = "";
        for (char cc : stack) {
            s += cc;
        }
        return s;
    }
}
