import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindDiff3Test {

    @Test
    public void testRequirement1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);
        assertTrue(result.get(0).containsAll(Arrays.asList(1, 2, 3)) && result.get(0).size() == 3);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5, 6)) && result.get(1).size() == 3);
    }

    @Test
    public void testRequirement2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 4, 5};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(1, 2)) && result.get(0).size() == 2);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5)) && result.get(1).size() == 2);
    }

    @Test
    public void testRequirement3() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 4, 5};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(1, 2, 3)) && result.get(0).size() == 3);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5)) && result.get(1).size() == 2);
    }

    @Test
    public void testRequirement4() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 2, 4};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(1, 3)) && result.get(0).size() == 2);
        assertTrue(result.get(1).containsAll(Arrays.asList(4)) && result.get(1).size() == 1);
    }

    @Test
    public void testRequirement5() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {4, 5, 6};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(1, 2)) && result.get(0).size() == 2);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5, 6)) && result.get(1).size() == 3);
    }

    @Test
    public void testRequirement6() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 4, 5};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(2)) && result.get(0).size() == 1);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5)) && result.get(1).size() == 2);
    }

    @Test
    public void testRequirement7() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {4, 4, 5};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(1, 2)) && result.get(0).size() == 2);
        assertTrue(result.get(1).containsAll(Arrays.asList(4, 5)) && result.get(1).size() == 2);
    }

    @Test
    public void testRequirement8() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 1, 3};
        List<List<Integer>> result = findDiff3.findDifference(nums1, nums2);
        System.out.println(result);

        assertTrue(result.get(0).containsAll(Arrays.asList(2)) && result.get(0).size() == 1);
        assertTrue(result.get(1).containsAll(Arrays.asList(3)) && result.get(1).size() == 1);
    }
}
