// // class Solution {
// //     public boolean isValid(String s) {
// //       Deque<Character> stack = new ArrayDeque<>();
// //       for( char c : s.toCharArray()){
// //          if (c == '(')
// //           stack.push(')');
// //         else if (c == '{')
// //           stack.push('}');
// //         else if (c == '[')
// //           stack.push(']');
// //         else if (stack.isEmpty() || stack.pop() != c)
// //           return false;
  
     

// //     }
// //      return stack.isEmpty();
// // }
// // }

// class Solution{
//     public boolean isValid(String s){
//         HashMap<Character,Character> parenthesis = new HashMap<>();
//         parenthesis.put('(',')');
//         parenthesis.put('{','}');
//         parenthesis.put('[',']');
//         Stack<Character> stack = new Stack<>();
//         for( int i=0;i< s.length();i++){
//             if(parenthesis.containsKey(s.charAt(i))){
//                 stack.push(s.charAt(i));
//             }
//             else{
//                 if(stack.isEmpty() || parenthesis.get(stack.pop())!=s.charAt(i)){
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }

class Solution {
        public boolean isValid(String s) {
            while(true){
                if(s.contains("()")){
                    s=s.replace("()","");
                }
               else if(s.contains("[]")){
                    s=s.replace("[]","");
                }
                else if(s.contains("{}")){
                    s=s.replace("{}","");
                }
                else{
                    return s.isEmpty();
                }
            }
        }
}