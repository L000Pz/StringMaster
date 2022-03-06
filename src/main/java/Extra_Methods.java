public class Extra_Methods {
    /**
     * <p>Returns true if the string has numbers.</p>
     *
     * <p>Example: String = "1234" has numbers!</p>
     *
     * @param ez the given string which can be number or text
     * @return whether the string contains any numbers or not
     */
    public static boolean NumericCheck (String ez){
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(ez);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
            return true;
        else
            return false;
    }

    /**
     * <p>Returns true if the string is palindromic.</p>
     * <p>A palindromic word is a word that reads the same backwards as forwards</p>
     * <p>Example: mom,dad,radar</p>
     *
     * @param str a string which might or might be a palindrome
     * @return whether the string contains palindromes or not
     */
    public static boolean PalindromicString (String str){
        String rev="";
        for(int i=str.length()-1; i> -1 ; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            return true;
        }else{
           return false;
        }
    }

    /**
     * <p>Write a program that will find Lexicographically smallest and largest substring of length k</p>
     * <p>Note: Lexicographic order is also known as alphabetic order dictionary order.
     * So “ball” is smaller than “cat”, “dog” is smaller than “dorm”.
     * Capital letter always comes before smaller letter,
     * so “Happy” is smaller than “happy” and “Zoo” is smaller than “ball”.</p>
     *
     * @param str a string containing english alphabets
     * @param sub_len the length of the new substrings
     * @return the smallest substring followed by the largest
     */
    public static String Lexicographic_String(String str ,int sub_len){
        String temp="";
        int len = str.length();
        int l =len-sub_len+1;
        String array[] = new String[l];

        for(int i = 0; i < l; i++) {
            array[i]=str.substring(i,i+sub_len);
        }
        int n = array.length;
        for(int p = 0; p< n - 1; p++)
        {
            for(int u = p + 1; u < n; u++)
            {
                if(array[u].compareTo(array[p])<0)
                {
                    temp=array[p];
                    array[p]=array[u];
                    array[u]=temp;
                }

            }
        }
        return array[0]+" "+array[n-1];
    }
}
