package src.PlusOne;

import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;  // If the digit is less than 9, increment it and return the array
            }
            digits[i] = 0;  // If the digit is 9, set it to 0 and continue
        }

        // If we exit the loop, it means all digits were 9, so we need a new array with a leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};  // [1, 2, 4]
        int[] digits2 = {4, 3, 2, 1};  // [4, 3, 2, 2]
        int[] digits3 = {9};  // [1, 0]
        int[] digits4 = {9, 9, 9};  // [1, 0, 0, 0]
        System.out.println(Arrays.toString(plusOne(digits1)));  // [1,2,4]
        System.out.println(Arrays.toString(plusOne(digits2)));  // [4,3,2,2]
        System.out.println(Arrays.toString(plusOne(digits3)));  // [1,0]
        System.out.println(Arrays.toString(plusOne(digits4)));  // [1,0,0,0]
    }
}

