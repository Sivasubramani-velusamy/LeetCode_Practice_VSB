class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int count = 0;
        if( low == high && low >=0 && high <=10) return 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i))
                count++;
        }
        return count;
    }

    public static boolean isSymmetric(int x){
            String x1 = Integer.toString(x);
            if(x1.length()%2 == 1) return false;

            //String firstHalf = x1.substring(0,x1.length()/2);
            //String secondHalf = x1.substring(x1.length()/2;
            int sum1 =0, sum2=0;
            int j= (x1.length())-1;
            for( int i=0;i<x1.length()/2;i++,j--){
                sum1+= x1.charAt(i)-'0';
                sum2+= x1.charAt(j)-'0';
            }
            return sum1 == sum2;
        }
}