package basic_problems;

import java.util.Stack;

/***
 * Given a string "pattern", which contains only two types of characters ‘(’, ‘)’.
 *
 * Your task is to find the minimum number of parentheses either ‘(’, ‘)’
 * we must add the parentheses in string ‘pattern’ and the resulted string is valid.
 *
 * Condition for valid string-
 *
 * Every opening parenthesis ‘(’ must have a correct closing parenthesis ‘)’.
 */
public class MinimumParenthesis {
    public static int minimumParentheses(String pattern) {
        Stack<Character> stack = new Stack<>();

        int count = 0;

        for(char c : pattern.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty()){
                stack.pop();
            }else{
                count++;
            }
        }

        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumParentheses(")((()"));
    }
}
