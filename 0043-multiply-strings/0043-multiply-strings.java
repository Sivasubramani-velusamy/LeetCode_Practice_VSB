// class Solution {
//     public String multiply(String num1, String num2) {
//         long n1=0,n2=0;
//         for(int i =0; i<num1.length();i++){
//             char ch = num1.charAt(i);
//              n1 = n1 *10+(ch-'0');
//         }
    
//         for(int i =0; i<num2.length();i++){
//             char ch = num2.charAt(i);
//              n2 = n2 *10+(ch-'0');
//         }

//         long mul = n1*n2;
//         StringBuilder sb = new StringBuilder("" + mul);

//         return  sb.toString();
//     }
// }
class Solution {
	public String multiply(String num1, String num2) {
		if ("0".equals(num1) || "0".equals(num2))
			return "0";

		int[] mul = new int[num1.length() + num2.length() - 1];

		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				mul[i+j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
       System.out.print( Arrays.toString(mul));
		for (int i = mul.length - 1; i > 0; i--) {
			mul[i - 1] += mul[i] / 10;
			mul[i] %= 10;
		}

		StringBuilder sb = new StringBuilder();
		for (int i : mul) {
			sb.append(i);
		}

		return sb.toString();
	}

}