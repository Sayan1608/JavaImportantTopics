package basic_problems;

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
