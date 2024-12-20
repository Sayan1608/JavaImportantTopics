package basic_problems;

/***
 * Problem statement
 * You are given a number 'N' in the form of a string 'S',
 * your task is to find the smallest number strictly greater than the given number 'N' which is a palindrome.
 *
 * Note:
 *
 * 1) A palindrome is a word, number, phrase,
 * or another sequence of characters that reads the same backward as forward,
 * such as 'naman', 'abcba', '1234321', etc
 * 2) The numerical value of the given string 'S' will be greater than 0.
 * 3) A single-digit number is also considered as a palindrome.
 * 4) Note that the length of the string 'S' is nothing but the number of digits in the number 'N'.
 */
public class NextPalindrome {
    public static String nextLargestPalindrome(String number, int length) {
       if(isAll9s(number, length)) return String.valueOf((int)(10 * Math.pow(10,length-1)) + 1);
       else {
          return generateNextPalindromeNumber(number,length);
       }
    }

    private static String generateNextPalindromeNumber(String number, int length) {
        int [] num = new int[number.length()];
        int k=0;
        for(int i=0;i<number.length();i++){
            num[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        int mid = length/2;
        int i = mid-1;
        int j = (length %2 == 0) ? mid : mid + 1;
        boolean leftSmaller = false;

        // Initially ignoring the matching middle elements
        while(i >= 0 && num[i] == num[j]){
            i--;
            j++;
        }

        //check if middle digits needs to be incremented
        //or copying left side to right side is insufficient
        if(i < 0 || num[i] < num[j]) leftSmaller = true;

        //
        while(i >= 0){
            num[j++] = num[i--];
        }

        //handle the case where middle digit(s) has to be incremented
        if(leftSmaller){
            int carry = 1;
            if(length %2 == 1){
                num[mid]+=carry;
                carry = num[mid]/10;
                num[mid]%=10;
            }
            i=mid-1;
            j = (length %2 == 0) ? mid : mid + 1;

            // Add 1 to the rightmost digit of the left
            // side, propagate the carry towards MSB digit
            // and simultaneously copying mirror of the
            // left side to the right side.
            //when carry is zero no need to loop through till i>=0
            while(i>=0 && carry > 0){
                num[i]+=carry;
                carry = num[i]/10;
                num[i]%=10;
                num[j++]=num[i--];
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int n : num){
            sb.append(n);
        }

        return sb.toString();

    }

    private static boolean isAll9s(String number, int length) {
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)!='9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(nextLargestPalindrome("9999",4));
        System.out.println(nextLargestPalindrome("19991",5));
    }
}
