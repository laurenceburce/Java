/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 *  Example 1:
 *  Input: nums = [2,7,11,15], target = 9
 *  Output: [0,1]
 *  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 *  Example 2:
 *  Input: nums = [3,2,4], target = 6
 *  Output: [1,2]
 * 
 *  Example 3:
 *  Input: nums = [3,3], target = 6
 *  Output: [0,1]
 * 
 * Constraints:
 *  2 <= nums.length <= 104
 *  -109 <= nums[i] <= 109
 *  -109 <= target <= 109
 *  Only one valid answer exists.
 * */

package LeetCode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map
        Map<Integer, Integer> numMap = new HashMap<>();
        // Iterate through the array
        for (int x = 0; x < nums.length; x++) {
            // Value of the complement 
            int y = target - nums[x];
            // Check if the complement exists in the hash map
            if (numMap.containsKey(y)) {
                // Return the indices
                return new int[]{numMap.get(y), x};
            }
            // Add the current number to the hash map
            numMap.put(nums[x], x);
        }
        return new int[]{};
    }
}