class Solution {
    public int sumBase(int n, int k) {
        int baseSum =0;

        while(n!=0){
            baseSum+= n%k;
            n/=k;
        }
        return baseSum;
    }
}