package basic_problems;

import java.util.Scanner;

/***
 * Reverse the given string word-wise. The last word in the given string should come at 1st place,
 * the last-second word at 2nd place, and so on. Individual words should remain as it is.
 */
public class ReverseStringWordWise {
    static String reverseStringWordWise(String input) {
        String[] words = input.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i>0) result.append(" ");
        }
        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
