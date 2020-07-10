package top200;

import jianZhiOffer.ListNode;

public class Top0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tmp =0;
        int flag = 0;
        int leftVal = 0;
        int rightVal = 0;
        ListNode res = l1;
        ListNode pre = l1;
        while(l1 != null && l2 != null){
            pre = l1;
            tmp = l1.val + l2.val + flag;
            if(tmp>=10){
                flag = 1;
                l1.val = tmp -10;
            }else{
                flag=0;
                l1.val = tmp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null){
            while(flag ==1 && l1!=null){
                tmp = l1.val + flag;
                if(tmp>=10){
                    flag = 1;
                    l1.val = tmp -10;
                }else{
                    flag=0;
                    l1.val = tmp;
                }
                l1 = l1.next;
            }
        }
        if(l2 != null){
            pre.next = l2;
            while(flag ==1 && l2!=null){
                tmp = l2.val + flag;
                if(tmp>=10){
                    flag = 1;
                    l2.val = tmp -10;
                }else{
                    flag=0;
                    l2.val = tmp;
                }
                l2 = l2.next;
            }
        }
        if(flag==1){
            pre.next = new ListNode(1);
        }
        return res;
    }

}
