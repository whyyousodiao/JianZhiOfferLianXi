package jianZhiOffer;

import jianZhiOffer.ListNode;

public class JianZhiOffer022 {
}


class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fNode = new ListNode(1);
        ListNode rNode = new ListNode(1);
        fNode.next = head;
        rNode.next = head;
        int n = k;
        while(n>0){
            rNode.next = rNode.next.next;
            n--;
        }
        while(rNode.next != null){
            rNode.next = rNode.next.next;
            fNode.next = fNode.next.next;
        }
        return fNode.next;
    }
}
