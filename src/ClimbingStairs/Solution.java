package src.ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; // If there's only one step, there is only one way to climb it
         // Initialize the previous and current steps for the base case
        // prev = 1 represents 1 way to reach the first step
        // curr = 2 represents 2 ways to reach the second step (1+1 or 2)
        int prev = 1, curr = 2;
        // Loop through from step 3 to n and calculate ways to reach each step
        for (int i = 3; i <= n; i++) {
            // Store the current value of curr in temp
            int temp = curr;
            // Calculate the new current value: the number of ways to reach this step
            curr = prev + curr;
            // Update prev to the previous step's value
            prev = temp;
        }
        return curr; // Return the number of ways to reach the nth step
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.climbStairs(2)); // 2
        System.out.println(solution.climbStairs(3)); // 3
        System.out.println(solution.climbStairs(8)); // 34
    }
}
