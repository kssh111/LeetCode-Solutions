package src.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Filter only alphanumeric characters and convert to lowercase
        StringBuilder filteredStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredStr.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Check if the filtered string is a palindrome
        String str = filteredStr.toString();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));  // Output: true

        String s2 = "race a car";

        System.out.println(solution.isPalindrome(s2));  // Output: false

        String s3 = " ";

        System.out.println(solution.isPalindrome(s3));  // Output: true
    }
}


