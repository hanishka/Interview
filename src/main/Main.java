package main;

import main.arrayandstring.StringCompression;
import main.arrayandstring.StringRotation;

public class Main {

    public static void main(String[] args) {

        String compressedString = StringCompression.compressString("aabcccccaaa");
        System.out.println("Compressed String:"+compressedString);

        boolean rotation = new StringRotation().stringRotation("waterbottle", "erbottlewat");
        System.out.println("String Rotation:"+rotation);


    }
}
