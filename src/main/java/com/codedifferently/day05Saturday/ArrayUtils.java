package com.codedifferently.day05Saturday;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) { //Works
        Integer occurs = 0;
        for(int i =0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount)) occurs++;
        }
        return occurs;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) { //******************Methods not working*********************
//        if (objectArray == null
//                || objectArray.contains(objectToRemove) < 0 //WHY CANT I USE indexOf or contains here?
//                || objectArray.indexOf(objectToRemove) >= objectArray.length) {
//
//            return objectArray;
//        }

        ArrayList arrRemoved = new ArrayList(objectArray.length);
        for(int i = 0; i < objectArray.length; i++) {
            if(!objectArray[i].equals(objectToRemove)) arrRemoved.add(objectArray[i]);
            System.out.println(objectArray[i]);
        }
        return arrRemoved.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    //sort the array. then as you loop you will be able to grab each number side by side.
    //split the array into pieces and get the length of each section?
    public static Object getMostCommon(Object[] objectArray) { //******************NOT WORKING*********************
        Integer numCount = 1; // numberFrequencyCounter
        Integer highCount = 1; // highestFrequencyCounter
        Integer freqNum = null;
        Integer currentNumber;

        Arrays.sort(objectArray); //sort the array so we can see consecutive numbers.

        for(int i = 1; i < objectArray.length -1; i++) { //start at 1 because we assigned variables to first ele. End at -1 because we cant find i+1 if we go to the end.
            currentNumber = (Integer) objectArray[i];
            Integer nextNumber = (Integer) objectArray[i + 1];

            if (nextNumber.equals(currentNumber)) numCount++;
            else numCount = 1;                          //The number needs to reset to 1, not 0 here. Since we are asking for the number ahead, we need to add one for the current as well.

            if (numCount > highCount) {
                highCount = numCount;
                freqNum = currentNumber;
            }

        }
        return freqNum;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer numberFrequencyCounter = objectArray.length; //
        Integer lowestFrequencyCounter = objectArray.length; //
        Integer leastFreqNum = null;
        Integer currentNumber;

        Arrays.sort(objectArray);

        for(int i = 1; i < objectArray.length -1; i++) {
            currentNumber = (Integer) objectArray[i];
            Integer nextNumber = (Integer) objectArray[i + 1];

            if(nextNumber.equals(currentNumber)) numberFrequencyCounter--;
            else numberFrequencyCounter = objectArray.length;

            if(numberFrequencyCounter < lowestFrequencyCounter) { ////// wont quite work because it always starts lower!
                leastFreqNum = currentNumber;
                lowestFrequencyCounter = numberFrequencyCounter; //THIS SEEMS LIKE ITS WRONG.. LOOK INTO IT.
            }
        }
        return leastFreqNum;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) { //WALK THROUGH THIS UNTIL YOU UNDERSTAND!
                Object[] newArray = new Object[objectArray.length + objectArrayToAdd.length];
                System.arraycopy(objectArray, 0, newArray, 0, objectArray.length); //add first arr at 0 pos.
                System.arraycopy(objectArrayToAdd, 0, newArray, objectArray.length, objectArrayToAdd.length); // add sec arr at first arr.length - after first arr.

                return newArray;
    }
}
