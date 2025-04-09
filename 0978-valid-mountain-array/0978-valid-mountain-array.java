class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int maxVal = arr[0];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxVal) {
                maxVal = arr[i];
                k = i;
            }
        }
        if (k == 0 || k == arr.length - 1)
            return false;
        System.out.println(k);
        System.out.println(maxVal);
        for (int i = 0; i < k; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        for (int i = k; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}