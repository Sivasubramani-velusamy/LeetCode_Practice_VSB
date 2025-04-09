class Solution {
    public int missingNumber(int[] nums) {
        int sizeSum =0;
        for( int i=0;i<=nums.length;i++){
            sizeSum+=i;
        }

        int elementSum =0;
        for( int i=0; i<nums.length;i++){
            elementSum+=nums[i];
        }

        return sizeSum - elementSum;
    }
}