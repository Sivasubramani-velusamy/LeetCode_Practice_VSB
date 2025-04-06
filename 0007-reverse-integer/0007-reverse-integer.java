class Solution 
{
    public int reverse(int x) {
       int max  =  Integer.MIN_VALUE; //-2147483648

      long y = 0;
        while(x != 0)
        {
            int z = x%10;
            System.out.println(z);
            y = y * 10 + z;
            x/=10;
        }
        
        return ( y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) ? 0: (int) y;
    }
}