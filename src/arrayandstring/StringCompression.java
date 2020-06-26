package arrayandstring;

public class StringCompression {

        public static void main(String[] args) {
            String compressedString = compressString("aabcccccaaa");
            System.out.println("Compressed String:"+compressedString);
        }

        private static String compressString(String str)
        {
            StringBuilder comprStr = new StringBuilder();
            int charCount = 1;

            for(int  i = 0; i < str.length(); i++){

                if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                    charCount = charCount + 1;
                }
                else{
                    comprStr.append(str.charAt(i));
                    comprStr.append(charCount);
                    charCount = 1;
                }

            }
            if(comprStr.length() > str.length()){
                return str;
            }
            return comprStr.toString();
        }


}
