class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' || s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                S.append(Character.toLowerCase(c));
            }
        }
        StringBuilder SS = new StringBuilder(S);
        SS = SS.reverse();
        return SS.toString().equals(S.toString());
        //return SS.equals(S);
        
    }
}