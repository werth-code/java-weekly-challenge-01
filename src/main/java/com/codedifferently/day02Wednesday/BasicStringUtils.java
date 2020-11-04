package com.codedifferently.day02Wednesday;

import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String finalWord = "";
        String[] split = str.split(" ");
        for(int i = 0; i < split.length; i ++) {
            finalWord += Character.toUpperCase(split[i].charAt(0)) + split[i].substring(1) + " ";
        }
        return finalWord.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String[] split = str.split("");

        for(int i = 0; i < split.length/2; i++) {
            String temp = split[i];
            split[i] = split[split.length-i -1];
            split[split.length -i -1] = temp;
        }
        return String.join("", split);

//        String rstring = "";
//        String[] split = str.split("");
//
//        for(int i = split.length -1; i >= 0; i--) {
//            rstring += split[i];
//        }
//        return rstring;
    }

    /**
     * @param //str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */

    public static String reverseSingleWord(String word) { // Method called with reverseWords
        String[] split = word.split("");
        for(int i = 0; i < split.length/2; i++) {
            String curChar = split[i];
            split[i] = split[split.length -i -1];
            split[split.length -i -1] = curChar;
        }
        return String.join("", split) + " ";
    }

    public static String reverseWords(String str) { //reverse words in current position.
        String revSentence = "";
        String[] splitSentence = str.split(" ");

        for(int i = 0; i < splitSentence.length; i++) {
            revSentence += reverseSingleWord(splitSentence[i]);
        }
        return revSentence.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String changedCase = "";
        char[] letters = str.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            if(Character.isUpperCase(letters[i])) {
                changedCase += Character.toLowerCase(letters[i]);
            }
            else if (Character.isLowerCase(letters[i])) {
                changedCase += Character.toUpperCase(letters[i]);
            }
            else changedCase += " ";
        }
        return changedCase;
    }
}
