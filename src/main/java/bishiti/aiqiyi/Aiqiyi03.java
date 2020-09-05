package bishiti.aiqiyi;

import java.util.*;

public class Aiqiyi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        if(len%2==1){
            System.out.println("False");
            return;
        }
        Map<Character,Character> pare = new HashMap<>();
        pare.put(')','(');
        pare.put(']','[');
        pare.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(pare.containsKey(c)){
                if(stack.isEmpty() || !stack.peek().equals(pare.get(c))){
                    System.out.println("False");
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        System.out.println(!stack.isEmpty()?"False":"True");
    }
}
