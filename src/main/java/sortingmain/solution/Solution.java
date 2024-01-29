package sortingmain.solution;

import sortingmain.exception.InvalidInputException;
import sortingmain.sortingutillity.Sortinglogic;

public class Solution {

    /**
     * PROBLEM STATEMENT:
     * Return a value based on the contents of the array N in ascending numeric
     * order where M is the Min and Max length of your solution. Please handle
     * any exceptions that may occur from the incoming parameters.
     *  @param M An integer of any length
     * 	@param N An Integer array of n-length
     * 	@return String or throw exception
     * Example input:
     * M = 3
     * N = new Integer[]{2, 3, 1};
     * Answer:
     * 123
     *
     * Approach: Implementing custom mergesort for sorting and handling Exception
     * Runtime: O(nlogn)
     */

    public static String solution(int M,Integer[] N) throws InvalidInputException {
        if( N == null){
            throw new InvalidInputException("Given input array is null,Please provide a valid input array");
        }

        if( N.length == 0){
            throw new InvalidInputException("Given input array is Empty,Please provide values in input array");
        }

        if( M <= 0){
            throw new InvalidInputException("Size of result array cannot have a negative value or zero. Please give a valid input");
        }

        Integer[] resultArray = Sortinglogic.mergeSort(N);
        StringBuilder outputString = new StringBuilder();
        try {

            for (int i=0;i<M;i++){
                outputString.append(resultArray[i]);
            }

        }catch (ArrayIndexOutOfBoundsException exception){
            throw new InvalidInputException("Result array cannot have size greater than size of input array : "+exception.getMessage());
        }
        return outputString.toString();

    }
}
