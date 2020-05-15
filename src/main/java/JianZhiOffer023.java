public class JianZhiOffer023 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(0);
        ListNode rear = new ListNode(0);
        ListNode tmp = new ListNode(0);
        if(head == null || head.next==null){
            return head;
        }
        pre = head;
        rear = head.next;
        while(rear != null){
            tmp = rear.next;
            rear.next=pre;
            pre = rear;
            rear = tmp;
        }
        head.next = null;
        return pre;
    }
}
