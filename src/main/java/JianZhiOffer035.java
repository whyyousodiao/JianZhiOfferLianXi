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
        Node cloneNode = head.next;
        Node cloneHead = cloneNode;
        head.next = cloneNode.next;
        head = head.next;
        while(head!=null){
            cloneNode.next = head.next;
            head.next = head.next.next;
            head = head.next;
            cloneNode = cloneNode.next;
        }
        return cloneHead;

    }


}
