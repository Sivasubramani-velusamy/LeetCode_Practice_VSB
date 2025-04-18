class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int res [] = new int[2];
        int i =0, j = nums.length-1;
        // for( int i =0; i< nums.length;i++){
        //     for( int j=i+1;j< nums.length;j++){
        //         if(nums[i]+ nums[j] == target){
        //             res[0] = i+1;
        //             res[1] = j+1;
        //             break; 
        //         }
        //     }
        // } // tle issus for last test case;
         while( i<j){
            if( nums[i]+ nums[j] == target) {
               
                return new int []{i+1,j+1};
            }
            else if(nums[i]+ nums[j] > target){
                j--;
            }
            else {
                i++;
            }
         }

        return new int []{i+1,j+1};
    }
}