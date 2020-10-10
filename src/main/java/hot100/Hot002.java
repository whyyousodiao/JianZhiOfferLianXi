package hot100;

/**
 * @author xikai
 */
public class Hot002 {
    /*
    两数相加
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(l1!=null || l2!=null){
            int num1 = l1==null?0:l1.val;
            int num2 = l2==null?0:l2.val;
            int sum = (num1+num2+flag)%10;
            flag = (num1+num2+flag)/10;

            tmp.next = new ListNode(sum);
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(flag==1){
            tmp.next = new ListNode(1);
        }
        return res.next;
    }
}
