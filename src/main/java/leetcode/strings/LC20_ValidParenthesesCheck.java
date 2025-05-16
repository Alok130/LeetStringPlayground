package leetcode.strings;

import java.util.Stack;

public class LC20_ValidParenthesesCheck {

    public static boolean isValid(String s) {

        if(s.length()%2 != 0){
            return false;
        }

        Stack<Character> st = new Stack<Character>();

        for(char ch : s.toCharArray()){
            //System.out.println("Value of "+ch+" "+(int)ch);
            if(ch == '(' || ch == '[' || ch == '{'){ // opening
                st.push(ch);
            } else { // closing
                if(st.size() == 0){
                    return false;
                }

                if ((ch == ')' && st.peek() == '(') ||
                        (ch == ']' && st.peek() == '[') ||
                        (ch == '}' && st.peek() == '{')){
                    st.pop();
                } else { //no match
                    return false;
                }
            }
        }
        return st.size() == 0;
    }

    public static boolean isValidUsingArray(String s) {
        char [] st = new char[s.length()];
        int top = 0;

            for(char ch : s.toCharArray()){
                if(ch == '(' || ch == '{' || ch == '['){ // opening
                    st[top++] = ch;
                } else { //closing
                    if(top == 0){
                        return false;
                    } else {
                        top--;
                        if((st[top] == '(' && ch == ')') || (st[top] == '[' && ch == ']') || (st[top] == '{' && ch == '}')){
                            continue;
                        }
                        return false;
                    }
                }
            }
        return top == 0;
    }
}
