package dailyRandom;

import java.util.Stack;

public class RD0394 {
    public String decodeString(String s) {
        StringBuffer numBuffer = new StringBuffer(s);
        StringBuffer resString = new StringBuffer(s);
        StringBuffer tmpBuffer = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        int len = s.length();
        int i=0;
        char left = 'A';
        char right = 'z';
        char leftNum = '0';
        char rightNum = '9';
        int pre = 0;
        char c = 'a';

        while(i<len){
            c = s.charAt(i);
            if(left<=c && c<=right){
                tmpBuffer.append(c);
            }
            while(leftNum<=c && c<=rightNum){
                numBuffer.append(c);
            }
            stack1.add(Integer.valueOf(numBuffer.toString()));
            numBuffer.delete(0,numBuffer.length());
            if(s.charAt(i)=='['){
                stack.push(i);
                i++;
                continue;
            }
            if(s.charAt(i)==']'){

                pre = stack.pop();
            }
            if(!stack.isEmpty()){
                tmpBuffer.append(s.charAt(i));
            }
        }
        return resString.toString();
    }

}
