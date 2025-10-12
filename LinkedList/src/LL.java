public class LL {
    // head Node//
    Node head;

     int size;
    // constructor
    LL(){
        this.size=0;
    }

    // class node used to many linked list
  public static class Node {

        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }


    // add first
    public void addFirst(String data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addLast(String data){

        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=newNode;
            return;
        }
        // for traverse

        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    // insert in the middle//
    // by sizing method
//    public void addMiddle(String data){
//        Node newNode=new Node(data);
//        if (head==null){
//            head=newNode;
//            return;
//        }
//        // Find middle position
//        int middle=size/2;
//        Node middleNode=head;
//        for (int i=0;i<middle-1;i++){
//            middleNode=middleNode.next;
//        }
//        // Insert new node
//        newNode.next=middleNode.next;
//        middleNode.next=newNode;
//        size++;
//
//    }

// by fast,slow pointer method

public void addMiddle(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            size++;
            return;

        }
        Node fast=head;
        Node slow=head;
        // move slow by 1 and fast by 2
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
        size++;

}


    // print
    public void printList(){
        // check if head is empty
        if (head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.println("Null");

    }
    // delete first
        public void deleteFirst(){
        if (head==null){
            System.out.println("list is null");
            return;

        }
        size--;
        head=head.next;
        }
    // deleteLast
    public void deleteLast(){
      if (head==null){
          System.out.println("list is null");
          return;
      }
      size--;
      if (head.next==null){
          head=null;
          return;
      }
      Node secondLast=head;
      Node lastNode=head.next;
      while (lastNode.next!=null){
          lastNode=lastNode.next;
          secondLast=secondLast.next;

      }
      secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    // reverse a linked list//

    public void reverseList(){
        if (head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode.next;

            // update
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        prevNode.next=head;

    }



    static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();


        list.addLast("list");
        list.printList();
        list.addMiddle("good");
        list.printList();


        list.addFirst("This");
        list.printList();


        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        // print the size of linked list//
        System.out.println(list.getSize());

        list.addFirst("1");
        list.addFirst("2");
        list.printList();


        list.addLast("3");
        list.printList();
        list.reverseList();
    }
}

//public class LL {
//    Node head;
//    public static class Node{
//        String data;
//        Node next;
//
//        Node(String data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    // add first
//    public void addFirst(String data){
//        Node newNode=new Node(data);
//        if (head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//
//    }
//    // add last
//    public void addLast(String data){
//        Node newNode=new Node(data);
//        if (head==null){
//            head=newNode;
//            return;
//
//        }
//        // traverse//
//        Node currNode=head;
//        while (currNode.next!=null){
//            currNode=currNode.next;
//
//        }
//        currNode.next=newNode;
//    }
//
//    public void printList(){
//        if (head==null){
//            System.out.println("List is empty");
//            return;
//        }
//        Node currNode=head;
//        while (currNode!=null){
//            System.out.print(currNode.data+" ->");
//            currNode=currNode.next;
//        }
//        System.out.println("null");
//    }
//
//    static void main(String[] args) {
//
//        LL list=new LL();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("This");
//        list.printList();
//
//
//    }
//}