// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int k=0;
//         for( int i:nums){
//             //int v = (i*i);
//             nums[k++]=(i*i);
//         }Arrays.sort(nums);
        
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sqrArr = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                sqrArr[index--] = leftSq;
                left++;
            } else {
                sqrArr[index--] = rightSq;
                right--;
            }
        }
        return sqrArr;
    }
}
