/*Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).*/

package main.arrayandstring;

public class StringCompression {

    public static String compressString(String str)
        {
            StringBuilder comprStr = new StringBuilder();
            int charCount = 1;

            for(int  i = 0; i < str.length(); i++){

                if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                    charCount = charCount + 1;
                }
                else{
                    comprStr.append(str.charAt(i)).append(charCount);
                    charCount = 1;
                }

            }
            if(comprStr.length() > str.length()){
                return str;
            }
            return comprStr.toString();
        }

}
