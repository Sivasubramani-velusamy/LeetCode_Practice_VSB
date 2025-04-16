class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MIN_VALUE+1; 
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);
        // int dividendL = Math.abs((int) dividend);
        // int divisorL = Math.abs((int) divisor);

        int quotient = 0;
        
        while (dividendL >= divisorL) {
            dividendL -= divisorL;
            quotient++;
        }

        return sign * quotient;
    }
}
