public class C_LoopAndString {
    /**
     * <p>Returns true if the string contains two consecutive character of
     * specified type.</p>
     *
     * <p>Example: "abbc" has two consecutive 'b'</p>
     *
     * @param s the given string
     * @param ch the given character
     * @return whether the string contains at least one consecutive pair of
     * the given character
     */
    public static boolean containsDoubleChar(String s, char ch) {
        int cnt=0;
        char[] inp = s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
                if (inp[i] == inp[i+1] && inp[i]==ch) {
                    return true;
                }

        }
        return false;
    }

    /**
     * <p>Implement Caesar cipher encryption algorithm (tag: cryptography)
     * Google it for more information</p>
     * <p>Only encrypt alphabetical characters:
     * <b>"ab c" shift=3 => "de f"</b></p>
     *
     * @param s text
     * @param offset shift amount
     */
    public static String caesarEncrypt(String s, int offset) {
        if (offset > 26){offset = offset % 26;}else if (offset < 0){ offset = (offset%26)+26;}
        String ciphered = "";
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch+offset);
                    if (c>'z'){
                        ciphered +=(char)(ch - (26-offset));
                    }
                    else {
                        ciphered += c;
                    }
                }else if (Character.isUpperCase(ch)){
                    char c = (char)(ch+offset);
                    if (c>'Z'){
                        ciphered +=(char)(ch - (26-offset));
                    }
                    else {
                        ciphered += c;
                    }
                }
            }else {
                ciphered += ch;
            }
        }
        return ciphered;
    }

    /**
     * <p>Implement Caesar cipher decryption algorithm (tag: cryptography)</p>
     * Google it for more information.</p>
     * <p>Ignore space: <b>"de f" shift=3 => "ab c"</b></p>
     * <p>You can use encryption method here.</p>
     *
     * @param s text
     * @param c shift amount
     */
    public static String caesarDecrypt(String s, int c) {
        String decrypted = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - c);
                if (ch < 'a') {
                    ch = (char) (ch - 'a' + 'z' + 1);
                }
                decrypted = decrypted + ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - c);
                if (ch < 'A') {
                    ch = (char) (ch - 'A' + 'Z' + 1);
                }
                decrypted = decrypted + ch;
            }else {
                decrypted = decrypted + ch;
            }
        }
        return decrypted;
    }

    /*
    If you have implemented all the previous parts completely and correctly
    feel free and add other methods as much as you want. Each extra method
    can add up to 5 points.

    Each method must come with its own unit-test.
     */
}
