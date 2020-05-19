public class JianZhiOffer035 {

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node htmp = head;
        Node res = new Node(0);
        Node tmp;
        htmp = head;
        while(head!=null){
            Node node = new Node(head.val);
            node.next = head.next;
            head.next = node;
            head = node.next;
        }
        head = htmp;
        res =head.next;
        while(head != null){
            tmp = head.next;
            if(head.random!=null){
                tmp.random = head.random.next;
            }else{
                tmp.random = null;
            }
            head = tmp.next;

        }
        head = htmp;
        while(head!=null){
            tmp = head.next;
            head.next = tmp.next;
            head = head.next;
            tmp.next = head.next;

        }

        return res;
    }


}
