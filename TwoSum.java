public class TwoSum {
// Input: nums = [2,7,11,15], target = 9
// Input: nums = [3,2,4], target = 6 = Output: [1,2]
// Input: nums = [3,3], target = 6
// Output: [0,1]
    public int[] twoSum(int[] nums, int target){

        // Pick the first number
        for (int i = 0; i < nums.length; i++) {
            
         // Compare it with every number after it
    for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair adds up to the target
                if(nums[i] + nums[j] == target){
                    // Return the indices of the matching pair
                    return new int[]{i, j};
                }

            }

        }

        // Return empty array if no solution is found
        return new int[]{};
    }
    
}
