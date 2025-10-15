public  class DoublyLL {
     static class Node{
         int data;
         Node next;
         Node prev;
         //construnctor
         Node (int data){
             this.data=data;
             this.next=null;
             this.prev=null;
         }
     }
     Node head;

    public void createList(){
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);

        head=first;
        first.next=second;
        second.prev=first;
        second.next=third;
        third.prev=second;
    }

    public void forwardTraverse(){
        Node currentNode=head;
        System.out.println("forward traverse");
        while (currentNode!=null){
            System.out.print(currentNode.data+ "-> " );
            currentNode=currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public void backwardTraverse(){
        Node currentNode=head;

        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        System.out.println("backward tranverse");
        while (currentNode!=null){
            System.out.print(currentNode.data+ " ->");
            currentNode=currentNode.prev;
        }
        System.out.println("null");
    }
    static void main(String[] args) {

        DoublyLL dll=new DoublyLL();
        dll.createList();
        dll.forwardTraverse();
        dll.backwardTraverse();
    }
}