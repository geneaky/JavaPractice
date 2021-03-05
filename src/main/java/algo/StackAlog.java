package algo;

import java.util.Stack;

public class StackAlog {
    public static void main(String[] args) {
        String input = "(({}))";
        System.out.println(isValid(input));

    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c:arr){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==')'){
                if(stack.size()==0 || stack.pop()!='('){
                    return false;
                }
            }else if(c=='}'){
                if(stack.size()==0 || stack.pop()!='{'){
                    return false;
                }
            }else if(c==']'){
                if(stack.size()==0 || stack.pop()!='['){
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.size()==0;
    }
}
