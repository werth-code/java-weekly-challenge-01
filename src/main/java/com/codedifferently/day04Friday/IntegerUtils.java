package com.codedifferently.day04Friday;

import static java.lang.Integer.parseInt;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String revDig = "";
        String[] numArr = val.toString().split("");

        for(int i =0; i < numArr.length/2; i++) {
            String temp = numArr[i];
            numArr[i] = numArr[numArr.length - i - 1];
            numArr[numArr.length - i - 1] = temp;
        }

        Integer strToInt = parseInt(String.join("", numArr));
        return strToInt;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return (val % 2 == 0) ? true : false;
    }
}
