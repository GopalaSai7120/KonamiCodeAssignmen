package sortinglogic;

import org.junit.jupiter.api.Test;
import sortingmain.solution.Solution;
import sortingmain.exception.InvalidInputException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SolutionTest {

    @Test
    public void testSolutionWithValidInput() throws InvalidInputException {
        Integer[] inputArray = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int M = 4;
        String expectedOutput = "1234";

        String result = Solution.solution(M, inputArray);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testSolutionWithEmptyArray() {
        Integer[] inputArray = {};
        int M = 3;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Given input array is Empty,Please provide values in input array", exception.getMessage());
    }

    @Test
    public void testSolutionWithNullArray() {
        Integer[] inputArray = null;
        int M = 3;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Given input array is null,Please provide a valid input array", exception.getMessage());
    }

    @Test
    public void testSolutionWithZeroM() {
        Integer[] inputArray = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int M = 0;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Size of result array cannot have a negative value or zero. Please give a valid input", exception.getMessage());
    }

    @Test
    public void testSolutionWithNegativeM() {
        Integer[] inputArray = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int M = -2;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Size of result array cannot have a negative value or zero. Please give a valid input", exception.getMessage());
    }

    @Test
    public void testSolutionWithMGreaterThanArraySize() {
        Integer[] inputArray = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        int M = 10;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Result array cannot have size greater than size of input array : 9", exception.getMessage());
    }

    @Test
    public void testSolutionWithNullElementInArray() {
        Integer[] inputArray = {4, 2, null, 1, 9, 5, 3, 8, 6};
        int M = 4;

        InvalidInputException exception = assertThrows(InvalidInputException.class, () -> Solution.solution(M, inputArray));
        assertEquals("Input array objects given are null please give valid input Array:null", exception.getMessage());
    }
}
