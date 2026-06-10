public class TwoSum {
// Input: nums = [2,7,11,15], target = 9
// Input: nums = [3,2,4], target = 6 = Output: [1,2]
// Input: nums = [3,3], target = 6
// Output: [0,1]
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }



        return new int[]{};
    }
    
}
