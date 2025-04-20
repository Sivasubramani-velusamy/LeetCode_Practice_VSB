class Solution {
    public int[] sortedSquares(int[] nums) {
        int k=0;
        for( int i:nums){
            //int v = (i*i);
            nums[k++]=(i*i);
        }Arrays.sort(nums);
        
        return nums;
    }
}
