package com.codedifferently.day03Thursday;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for(Integer num : intArray) {
            sum += num;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer sum = intArray[0];
        for(int i = 1; i < intArray.length; i++) {
            sum = (sum * intArray[i]);
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double sum = 0.0;
        Integer count = intArray.length;

        for(Integer num : intArray) {
            sum += num;
        }
        Double avg = sum / count;
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer largest = 0;
        for(int i =0; i < intArray.length; i++) {
            if(intArray[i] > largest) largest = intArray[i];
        }
        return largest;
    }
}
