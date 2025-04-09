// // // class Solution {
// // //     public List<List<Integer>> threeSum(int[] nums) {
// // //         List<List<Integer>> triplets = new ArrayList<>();
// // //         int n = nums.length;
// // //         for (int i = 0; i < n - 2; i++) {
// // //             for (int j = i + 1; j < n - 1; j++) {
// // //                 for (int k = j + 1; k < n; k++) {
// // //                     if (nums[i] + nums[j] + nums[k] == 0) {
// // //                         List<Integer> triplet = new ArrayList<>();
// // //                         triplet.add(nums[i]);
// // //                         triplet.add(nums[j]);
// // //                         triplet.add(nums[k]);
// // //                         Collections.sort(triplet);
// // //                         triplets.add(triplet);
// // //                     }
// // //                 }
// // //             }
// // //         }
// // //         List<List<Integer>> unique = new ArrayList<>();
// // //         for (List<Integer> i : triplets) {
// // //             if (!unique.contains(i)) {
// // //                     unique.add(i);
// // //             }
// // //         }
// // //         return unique;
// // //     }
// // // }

// // class Solution {
// //     public List<List<Integer>> threeSum(int[] nums) {
// //         List<List<Integer>> triplets = new ArrayList<>();
// //         int n = nums.length;
// //         Arrays.sort(nums);

// //         for (int i = 0; i < n - 2; i++) {
// //             for (int j = i + 1; j < n - 1; j++) {
// //                 for (int k = j + 1; k < n; k++) {
// //                     if (nums[i] + nums[j] + nums[k] == 0) {
// //                         List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
// //                         Collections.sort(triplet);
// //                         if (!triplets.contains(triplet)) {
// //                             triplets.add(triplet);
// //                         }
// //                     }
// //                 }
// //             }
// //         }
// //         return triplets;
// //     }
// // }

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> triplets = new ArrayList<>();
//         int n = nums.length;

//         Arrays.sort(nums); 

//         for (int i = 0; i < n - 2; i++) {
//             if (i > 0 && nums[i] == nums[i - 1])
//                 continue; // Skip duplicate i

//             for (int j = i + 1; j < n - 1; j++) {
//                 if (j > i + 1 && nums[j] == nums[j - 1])
//                     continue; // Skip duplicate j

//                 for (int k = j + 1; k < n; k++) {
//                     if (k > j + 1 && nums[k] == nums[k - 1])
//                         continue; // Skip duplicate k

//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     }
//                 }
//             }
//         }

//         return triplets;
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripletSet = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    tripletSet.add(triplet);

                    while (left < right && nums[left] == triplet.get(1))
                        left++;
                    while (left < right && nums[right] == triplet.get(2))
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

            while (i + 1 < n - 2 && nums[i + 1] == nums[i])
                i++;
        }

        return new ArrayList<>(tripletSet);
    }
}
