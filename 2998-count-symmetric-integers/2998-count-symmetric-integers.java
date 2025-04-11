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
// class Solution {
//     public int countSymmetricIntegers(int low, int high) {
//         int count = 0;
//         for (int i = low; i <= high; i++) {
//             count += isSymmetric(i);
//         }
//         return count;
//     }

//     public int isSymmetric(int num) {
//         int len = (num == 0) ? 1 : (int) Math.log10(num) + 1;

//         if (len % 2 != 0) return 0;

//         int[] digits = new int[len];
//         int temp = num;

//         for (int i = len - 1; i >= 0; i--) {
//             digits[i] = temp % 10;
//             temp /= 10;
//         }

//         int half = len / 2;
//         int sum1 = 0, sum2 = 0;

//         for (int i = 0; i < half; i++) {
//             sum1 += digits[i];
//             sum2 += digits[i + half];
//         }

//         return sum1 == sum2 ? 1 : 0;
//     }
// }
