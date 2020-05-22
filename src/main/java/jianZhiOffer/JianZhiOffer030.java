package jianZhiOffer;

import java.util.Stack;

public class JianZhiOffer030 {
    Stack<Integer> stack = new Stack<Integer>();
    int[] min = new int[1000];
    int index=0;
    public JianZhiOffer030() {

    }

    public void push(int x) {

        if(stack.size() == 0 || (index > 0 && x<=min[index-1])){

            min[index++] = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(index == 0){return;}
        if(stack.pop()==min[index-1]){
            index--;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if(index == 0){return 0;}
        return min[index-1];
    }

    public static void main(String[] args) {
        JianZhiOffer030 minStack = new JianZhiOffer030();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.min());
        System.out.println(minStack.min());
        System.out.println(minStack.min());
        System.out.println();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}
