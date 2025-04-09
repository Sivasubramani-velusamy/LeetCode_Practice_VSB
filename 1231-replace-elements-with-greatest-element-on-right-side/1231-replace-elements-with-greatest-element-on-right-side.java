class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 2; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            a[i] = max;
        }
        a[arr.length - 1] = -1;
        return a;
    }
}
