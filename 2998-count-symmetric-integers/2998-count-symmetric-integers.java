class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) count++;
        }
        return count;
    }

    public static boolean isSymmetric(int x) {
        String s = Integer.toString(x);
        int n = s.length();
        if (n % 2 != 0) return false;
        
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(n - 1 - i) - '0';
        }
        return sum1 == sum2;
    }
}
