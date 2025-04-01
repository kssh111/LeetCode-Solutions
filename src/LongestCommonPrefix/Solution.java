package src.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // Check if the input array is null or empty
        if (strs == null || strs.length == 0) {
            return "";  // Return empty string if input is invalid
        }

        // Sort the array of strings alphabetically
        Arrays.sort(strs);

        // Ең бірінші және соңғы жолдарды алу
        String first = strs[0]; // First string
        String last = strs[strs.length - 1];  // Last string

        int i = 0;
        // Ең бірінші және соңғы жолдарды салыстырамыз
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++; // Move to the next character if they match
        }

        // Return the longest common prefix (substring from index 0 to i)
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        // Example 1: There is no common prefix, so return ""
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));    // Output: ""
        // Example 2: The longest common prefix is "fl"
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Output: "fl"

    }
}
