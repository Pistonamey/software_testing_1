import java.util.*;

public class findDiff2 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /** Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
         *  answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
         *  answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
         *  Note that the integers in the lists may be returned in any order.
         */
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
		
		//Replace last two loops
        /*for (int n : nums1) {
            set2.remove(n);
        }
        for (int n : nums2) {
            set1.remove(n);
        }*/
		
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }
}