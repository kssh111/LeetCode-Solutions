package src.ExcelSheetColumnTitle;

public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-based index (because A = 1 in Excel, but 'A' = 0 in char)
            // Get the remainder to determine the current letter
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder); // Convert remainder to character ('A' + remainder gives 'A' to 'Z')
            result.insert(0, c); // Insert the character at the beginning of the result string
            columnNumber /= 26;// Move to the next "digit" in base-26
        }
        // Return the final column title as string
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.convertToTitle(1));   // A
        System.out.println(solution.convertToTitle(28));  // AB
        System.out.println(solution.convertToTitle(701)); // ZY
        System.out.println(solution.convertToTitle(2147483647)); // Үлкен тест
    }
}
