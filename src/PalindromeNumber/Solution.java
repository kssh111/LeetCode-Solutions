package src.PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;  // Negative numbers are not palindromes
        int reversed = 0, original = x;
        while (x > 0) {
            int digit = x % 10; // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            x /= 10; // Remove last digit
        }

        return original == reversed;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }
}
