package basic_problems;

/***
 * You have been given a text message. You have to return the Run-length Encoding of the given message.
 *
 * Run-length encoding is a fast and simple method of encoding strings.
 * The basic idea is to represent repeated successive characters as the character and a single count.
 * For example, the string "aaaabbbccdaa" would be encoded as "a4b3c2d1a2".
 */
public class EncodeMessage {
    public static String encode(String message) {
        StringBuilder res = new StringBuilder();
        char currentChar = message.toCharArray()[0];
        int count = 0;

        for(char c : message.toCharArray()){
            if(c == currentChar) count++;
            else {
                res.append(currentChar);
                res.append(count);
                currentChar = c;
                count = 1;
            }
        }
        res.append(currentChar);
        res.append(count);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("aaaabbbccdaa"));
    }
}
