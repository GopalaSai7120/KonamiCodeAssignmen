package sortingmain;

import sortingmain.exception.InvalidInputException;
import sortingmain.solution.Solution;

public class Main {


    /**
     * PROBLEM STATEMENT:
     * Return a value based on the contents of the array N in ascending numeric
     * order where M is the Min and Max length of your solution. Please handle
     * any exceptions that may occur from the incoming parameters.
     *  * @param M An integer of any length
     *  * @param N An Integer array of n-length
     *  * @return String or throw exception
     * Example input:
     * M = 3
     * N = new Integer[]{2, 3, 1};
     * Answer:
     * 123
     *
     * Approach: Implementing custom mergesort for sorting and handling Exception
     * Runtime: O(nlogn)
     */


    public static void main(String[] args) throws InvalidInputException {

        /**
         * USE CASE:
         * Valid input scenario
         * M = 3
         * N = {2,3,1}
         * Output : 123
         */
        Integer[] inputArray = new Integer[]{2,3,1};
        int M = 3;
        System.out.println("Answer:"+ Solution.solution(M,inputArray));

        /**
         * USE CASE:
         * Valid input scenario
         * M = 4
         * N = {2,7,1,9,5,3}
         * Output : 1235
         */
        inputArray = new Integer[]{2,7,1,9,5,3};
        M = 4;
        System.out.println("Answer:"+Solution.solution(M,inputArray));

        /**
         * USE CASE:
         * Valid input scenario
         * M = 4
         * N = {2,7,1,-9,5,-3}
         * Output : -9-312
         */
        inputArray = new Integer[]{2,7,1,-9,5,-3};
        M = 4;
        System.out.println("Answer:"+Solution.solution(M,inputArray));

        /**
         * ERROR CASE:
         * Invalid arguments with result array size set as negative
         * will result in Negativearraysize exception
         * M = -4
         * N = {2,7,1,9,5,3}
         * Output : throws CustomInvalidArgumentException
         * Size of result array cannot have a negative value or zero. Please give a valid input
         */
        inputArray = new Integer[]{2,7,1,9,5,3};
        M = -4;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);

        /**
         * ERROR CASE:
         * Invalid arguments with result array size is greater than input array
         * will result in ArrayIndexoutofbounds exception
         * M = 10
         * N = {2,7,1,9,5,3}
         * Output : throws CustomInvalidArgumentException
         * Result array cannot have size greater than size of input array : 6
         */
        inputArray = new Integer[]{2,7,1,9,5,3};
        M = 10;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);

        /**
         * ERROR CASE:
         * Invalid arguments with input array having null values
         * will result in Nullpointer exception
         * M = 4
         * N = {2,7,null,9,5,3}
         * Output : throws CustomInvalidArgumentException
         * Input array objects given are null please give valid input Array:null
         */
        inputArray = new Integer[]{2,7,null,9,5,3};
        M = 4;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);

        /**
         * ERROR CASE:
         * Invalid arguments with null array
         * M = 4
         * N = null
         * Output : throws CustomInvalidArgumentException
         * Given input array is null,Please provide a valid input array
         */
        inputArray = null;
        M = 4;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);

        /**
         * ERROR CASE:
         * Invalid arguments with empty array
         * M = 4
         * N = {}
         * Output : throws CustomInvalidArgumentException
         * Given input array is Empty,Please provide values in input array
         */
        inputArray = new Integer[]{};
        M = 4;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);


        /**
         * ERROR CASE:
         * Invalid arguments with result array size set as 0
         * M = 0
         * N = {2,7,1,9,5,3}
         * Output : throws CustomInvalidArgumentException
         * Size of result array cannot have a negative value or zero. Please give a valid input
         */
        inputArray = new Integer[]{2,7,1,9,5,3};
        M = 0;
        //TODO:Please uncomment bellow line for testing
        //Solution.solution(M,inputArray);

    }
}