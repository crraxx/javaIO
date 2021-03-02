package LiCode;

import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};

        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]){
                case "+":
                    int top = stack.pop();
                    int top2 = stack.peek();
                    stack.push(top);
                    stack.push(top+top2);
                    break;
                case "D":
                    int temp = 2*stack.peek();
                    stack.push(temp);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        for (int t :stack) {
            sum=sum+t;
        }
        return sum;
    }

}
