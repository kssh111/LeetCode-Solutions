package src.TwoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // target-тан nums[i]-ді аламыз

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Табылса, индекстерді қайтарамыз
            }

            map.put(nums[i], i); // Элементті HashMap-ке сақтаймыз
        }

        return new int[]{}; // Нәтиже табылмаса (бірақ міндетті түрде болады)
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};

        System.out.println("Output: " + java.util.Arrays.toString(twoSum(nums1, 9)));
        System.out.println("Output: " + java.util.Arrays.toString(twoSum(nums2, 6)));
        System.out.println("Output: " + java.util.Arrays.toString(twoSum(nums3, 6)));
    }
}
