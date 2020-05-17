import java.util.Stack;

public class JianZhiOffer031 {

    /*public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0 && popped.length == 0){
            return true;
        }
        if(pushed.length == 0 || popped.length == 0){
            return false;
        }

        Stack<Integer> stack = new Stack<Integer>();
        int len = pushed.length;

        int i=0;
        int j=0;

        while(i<len){
            if(stack.isEmpty() && j<len){
                stack.push(pushed[j]);
                j++;
                continue;
            }
            if(stack.peek()!=popped[i]){
                if(j==len){
                    break;
                }
                stack.push(pushed[j]);
                j++;
            }else{
                stack.pop();
                i++;
            }

        }

        return stack.isEmpty();
    }*/
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int i=0;
        for(int num : pushed){
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,3,2,1};
        JianZhiOffer031  jianZhiOffer031 = new JianZhiOffer031();
        boolean b = jianZhiOffer031.validateStackSequences(array1,array2);
        System.out.println(b);
    }

}
