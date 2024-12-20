package basic_problems;

/***
 * Ninja has been given a binary string ‘STR’ containing either ‘0’ or ‘1’.
 * A binary string is called beautiful if it contains alternating 0s and 1s.
 *
 * For Example:‘0101’, ‘1010’, ‘101’, ‘010’ are beautiful strings.
 *
 * He wants to make ‘STR’ beautiful by performing some operations on it.
 * In one operation, Ninja can convert ‘0’ into ‘1’ or vice versa.
 *
 * Your task is to determine the minimum number of operations Ninja should perform to make ‘STR’ beautiful.
 */
public class BeautifulString {
    public static int makeBeautiful(String str) {
        int withoutModifyingFirstCharacter = modify(str, str.charAt(0));
        int modifyingFirstCharacter = modify(str,str.charAt(0)=='0'?'1':'0') + 1;

        return Math.min(withoutModifyingFirstCharacter,modifyingFirstCharacter);
    }

    public static int modify(String str, char prev){
        int count = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == prev){
                count++;
                prev = str.charAt(i)=='0'?'1':'0';
            }else{
                prev = str.charAt(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(makeBeautiful("1001"));
    }
}
