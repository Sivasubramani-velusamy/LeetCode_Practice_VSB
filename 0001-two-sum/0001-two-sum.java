class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //    // List<Integer> indices = new ArrayList<>();
    //    int [] indices = new int [2];

    //     for( int i=0 ; i < nums.length; i++){
    //         for( int j = i+1; j < nums.length; j++){
    //             if( nums[i] + nums [j] == target){
    //                 indices[0] = i;
    //                 indices[1] = j;
    //                 return indices;
    //             }
    //         }
    //     }
    //     return null;
    // }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[j] + nums[j-i]) == target) {
                    return new int[] { j, j - i };
                }
            }
        }

        return new int[] {};
    }

}