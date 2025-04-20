class Solution {
    public int heightChecker(int[] heights) {
        int[] d = Arrays.copyOf(heights, heights.length);
        Arrays.sort(d);
        int count =0;
        // System.out.println(Arrays.toString(heights));
        // System.out.println(Arrays.toString(d));
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != d[i])
                count++;
        }
        return count;
    }
}