/*Assume you have a method i s S u b s t r i n g which checks if one word is a substring
        of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
        call to isSubstring [e.g., "waterbottle " is a rotation of "erbottlewat" ).*/

package main.arrayandstring;

public class StringRotation {

    public boolean stringRotation(String s1, String s2){
        if (s1.length() > 0 && s1.length() == s2.length()){
            return isSubString(s1, s2);
        }
        return false;
    }

    boolean isSubString(String s1, String s2){
        s1 = sortString(s1);
        s2 = sortString(s2);
        System.out.println(s1 + ", " + s2);

        return s1.equals(s2);
    }

    private String sortString(String str){
        char[] arrayOfCharacters = new char[str.length()];
        for(int i = 0; i < arrayOfCharacters.length; i++){
            for(int j = i+1; j < arrayOfCharacters.length; j++){
                if(arrayOfCharacters[i] > arrayOfCharacters[j]){
                    char temp = arrayOfCharacters[j];
                    arrayOfCharacters[j] = arrayOfCharacters[i];
                    arrayOfCharacters[i] = temp;
                }
            }
        }
        return String.valueOf(arrayOfCharacters);
    }

}
