class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc = true, dsc =true;

        for( int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                asc= false;
               // break;
            }
            if(nums[i] < nums[i+1]){
                dsc = false;
               // break;
            }
        }
        return dsc || asc;
    }
}