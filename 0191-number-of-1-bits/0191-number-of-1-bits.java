class Solution {
    // public int hammingWeight(int n) {
    //     int ones = 0;

    //     while( n!= 0){
    //         n= n&n-1;
    //         ones++;
    //     }
    //     return ones;
    // }

    public int hammingWeight(int n) {
    String binary = Integer.toBinaryString(n);
    int ones = 0;
    for (int i = 0; i < binary.length(); i++) {
        if (binary.charAt(i) == '1') {
            ones++;
        }
    }
    return ones;
}

}