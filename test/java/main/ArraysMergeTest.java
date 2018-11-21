package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysMergeTest {

    private ArraysMerge arraysMerge = new ArraysMerge();

    @Test
    void merge() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7, 8, 11};
        int[] result = {1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 11};
        Assert.assertTrue(Arrays.equals(result, arraysMerge.merge(arr1, arr2)));
    }
}