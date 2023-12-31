import java.util.*;

public class findDiff3 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /** Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
         *  answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
         *  answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
         *  Note that the integers in the lists may be returned in any order.
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            map.put(n1, 1);
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2)) {
                map.remove(n2);
            } else {
                map.put(n2, 1);
            }
			
			/* Replace if else with: 
			if (map.containsKey(n2) && map.get(n2) != -1) {
                map.put(n2,0);
            } else {
                map.put(n2, -1);
            }*/
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.get(0).add(entry.getKey());
            } else { //add else if (entry.getValue() == -1) {
                result.get(1).add(entry.getKey());
            }
        }
        return result;
    }
}