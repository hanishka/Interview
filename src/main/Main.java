package main;

import main.arrayandstring.StringCompressor;

public class Main {

    public static void main(String[] args) {

        String compressedString = StringCompressor.compressString("aabcccccaaa");
        System.out.println("Compressed String:"+compressedString);
    }
}
