package src.ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);

            // Convert char to its corresponding number: A=1, B=2, ..., Z=26
            int value = c - 'A' + 1;

            // Multiply previous result by 26 and add current value
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.titleToNumber("A"));   // 1
        System.out.println(solution.titleToNumber("AB"));  // 28
        System.out.println(solution.titleToNumber("ZY"));  // 701
    }
}
