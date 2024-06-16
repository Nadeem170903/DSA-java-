public class LinkList {

    Node head;

    public class Node{
        String data;
        Node next;

        // constructor

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(String data){
        
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    };

    public void printList(){
        Node currNode = head;
        while(currNode !=null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }



    public static void main(String args[]){
        LinkList list = new LinkList();

        list.insertFirst("hello");
        list.insertFirst("no");
        list.printList();
    }
}