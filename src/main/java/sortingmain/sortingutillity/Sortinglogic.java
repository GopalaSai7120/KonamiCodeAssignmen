package sortingmain.sortingutillity;

import sortingmain.exception.InvalidInputException;

public class Sortinglogic {

    public static Integer[] mergeSort(Integer[] inputArray) throws InvalidInputException {
        int inputArrayLength = inputArray.length;
        if(inputArrayLength<=1){
            return inputArray;
        }

        int mid = inputArrayLength/2;
        Integer[] leftHalf = new Integer[mid];
        Integer[] rightHalf = new Integer[inputArrayLength-mid];
        for (int i=0;i<mid;i++){
            leftHalf[i] = inputArray[i];
        }
        for (int i=mid;i<inputArrayLength;i++){
            rightHalf[i-mid] = inputArray[i];
        }

        leftHalf = mergeSort(leftHalf);
        rightHalf = mergeSort(rightHalf);

        return merge(leftHalf,rightHalf);
    }

    private static Integer[] merge(Integer[] leftHalf, Integer[] rightHalf) throws InvalidInputException {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        Integer[] result = new Integer[leftLength+rightLength];
        int leftIndex=0,rightIndex=0,resultIndex=0;

        try {
            while (leftIndex<leftLength && rightIndex<rightLength){
                if(leftHalf[leftIndex]<rightHalf[rightIndex]){
                    result[resultIndex] = leftHalf[leftIndex];
                    leftIndex++;
                }else {
                    result[resultIndex]=rightHalf[rightIndex];
                    rightIndex++;
                }
                resultIndex++;
            }
            while (leftIndex<leftLength){
                result[resultIndex]=leftHalf[leftIndex];
                leftIndex++;
                resultIndex++;
            }
            while (rightIndex<rightLength){
                result[resultIndex] = rightHalf[rightIndex];
                rightIndex++;
                resultIndex++;
            }
        }catch (NullPointerException exception){
            throw new InvalidInputException("Input array objects given are null please give valid input Array:"+exception.getMessage());
        }

        return  result;
    }
}
