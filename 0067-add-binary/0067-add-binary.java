// class Solution {
//     public String addBinary(String a, String b) {
//         int number0 = Integer.parseInt(a, 2);
//         int number1 = Integer.parseInt(b, 2);

//         int sum = number0 + number1;
//         return Integer.toBinaryString(sum);
//     }
// }
import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }
}
