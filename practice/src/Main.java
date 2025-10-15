//public class Main {
//
//    static class Node{
//        int data;
//        Node next;
//        Node prev;
//
//        Node(int data){
//            this.data=data;
//            this.next=null;
//            this.prev=null;
//        }
//
//    }
//    Node head;
//    public void addFirst(int data){
//       Node newNode=new Node(data);
//       if (head==null){
//          head=newNode;
//           return;
//       }
//       newNode.next=head;
//       head=newNode;
//
//    }
//    public void PrintList(){
//        if (head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        Node currentNode=head;
//        while (currentNode!=null){
//            System.out.print(currentNode.data + " ->");
//            currentNode=currentNode.next;
//        }
//        System.out.println("null");
//    }
//
//    public void deleteFirst(){
//        if(head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        head=head.next;
//    }
//
//    public void deleteLast(){
//        if (head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        if (head.next==null) {
//            head = null;
//        }
//        Node currentNode=head;
//        while (currentNode.next.next!=null){
//            currentNode=currentNode.next;
//        }
//        currentNode.next=null;
//
//    }
//
//    static void main(String[] args) {
//        Main LL=new Main();
//        LL.addFirst(1);
//        LL.addFirst(2);
//        LL.addFirst(3);
//        LL.PrintList();
//
//        LL.deleteLast();
//        LL.PrintList();
//    }
//}


public class Main {

    static class Node{
        int data;
        Node next;

       Node(int data){
           this.data=data;
           this.next=null;
       }

    }

    Node head;
    int size=0;
    public int getSize(){
      return size;

    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;


        }
        newNode.next=head;
        head=newNode;
        size++;



    }
   public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
       size++;

   }
   public void printList(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ->");
            currentNode=currentNode.next;

        }
       System.out.print("null");

   }

   public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        size--;

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
        size--;


   }
   public void insertAtIndex(int data,int index){
        if(index<0){
            System.out.println("invalid");
        }
        if(index==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        Node currentNode=head;
        int count=0;
        while(currentNode!=null && count<index-1) {
            currentNode = currentNode.next;
            count++;

        }

        newNode.next=currentNode.next;
        currentNode.next=newNode;
        size++;

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
        currentNode.next=currentNode.next.next;
       size--;

   }

    static void main(String[] args) {
        Main LL=new Main();
        LL.addFirst(2);
        LL.insertAtIndex(1,0);
        LL.deleteAtIndex(0);
        LL.addLast(3);
        LL.deleteAtIndex(1);
        LL.getSize();
//        LL.deleteFirst();
//        LL.deleteLast();

        LL.printList();
        System.out.println();
        System.out.println("the size of the node is "+LL.getSize());
    }
}