package sortinglogic;

import org.junit.jupiter.api.Test;
import sortingmain.exception.InvalidInputException;
import sortingmain.sortingutillity.Sortinglogic;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortinglogicTest {

    @Test
    public void testMergeSort() throws InvalidInputException {
        Integer[] inputArray = {4, 2, 7, 1, 9, 5, 3, 8, 6};
        Integer[] expectedSortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer[] result = Sortinglogic.mergeSort(inputArray);

        assertArrayEquals(expectedSortedArray, result);
    }

    @Test
    public void testMergeSortWithSingleElement() throws InvalidInputException {
        Integer[] inputArray = {5};
        Integer[] result = Sortinglogic.mergeSort(inputArray);

        assertArrayEquals(inputArray, result);
    }

    @Test
    public void testMergeSortWithNullElement() {
        Integer[] inputArray = {4, 2, null, 1, 9, 5, 3, 8, 6};

        assertThrows(InvalidInputException.class, () -> Sortinglogic.mergeSort(inputArray));
    }
}
