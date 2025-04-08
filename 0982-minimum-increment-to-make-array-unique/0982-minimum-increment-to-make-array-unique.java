public class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        //System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increment =( (nums[i - 1] + 1 )- nums[i]);
                //System.out.println( increment);
                nums[i] = nums[i - 1] + 1;
                moves += increment;
            }
        }
        return moves;
    }
}