public class DoublyLLpractice {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;


    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;

        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.prev=currentNode;
        currentNode=newNode;
    }

    public void printList() {
        Node currentNode = head;

        if (currentNode == null) {
            System.out.println("List is empty");
            return;
        }

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        Node newNode=head;
        if(head==null){
            head=newNode;
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currentNode=head;
        while(currentNode.next.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }

    public void addAtIndex(int data,int index){

        if(index<0){
            System.out.println("invalid");
            return;
        }
        if(index==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        Node currentNode=head;
        int count=0;
        while(currentNode!=null && count<index-1){
            currentNode=currentNode.next;
            count++;
        }
       newNode.next=currentNode.next;
        newNode.prev=currentNode;
        currentNode.next=newNode;

    }

    public void deleteAtIndex(int index){
        if(index<0){
            System.out.println("invalid");
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        Node currentNode=head;
        int count=0;
        while(currentNode!=null && count<index-1){
            currentNode=currentNode.next;
            count++;
        }

        if (currentNode == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if(currentNode.prev!=null){
            currentNode.prev.next=currentNode.next;
        }
       if(currentNode.next!=null){
           currentNode.next.prev=currentNode.prev;
       }

    }

    public static void main(String[] args) {
        DoublyLLpractice LL = new DoublyLLpractice();
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);
        LL.addLast(5);
//        LL.addAtIndex(4,3);
        LL.deleteAtIndex(0);

//        LL.deleteFirst();
        LL.deleteLast();

        LL.printList();
    }
}
