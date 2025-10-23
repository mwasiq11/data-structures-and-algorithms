//import java.util.*;
//public class Assignment2 {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    Node head;
//
//    public void addFirst(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void addLast(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        Node currentNode=head;
//        while(currentNode.next!=null){
//            currentNode=currentNode.next;
//        }
//        currentNode.next=newNode;
//    }
//
//
//    public void insertAtIndex(int data,int index){
//        if(index<0){
//            System.out.println("Invalid index");
//            return;
//        }
//        if(index==0){
//            addFirst(data);
//        }
//        Node newNode=new Node(data);
//        int count=0;
//        Node currentNode=head;
//        while(currentNode.next!=null && count<index-1){
//            currentNode=currentNode.next;
//        }
//        newNode.next=currentNode.next;
//        currentNode.next=newNode;
//    }
//
//    public void deleteFirst(){
//        if(head==null){
//            System.out.println("list is empty");
//            return;
//        }
//        head=head.next;
//
//    }
//
//    public void deleteLast(){
//        if(head==null){
//            System.out.println("list is empty");
//        }
//        Node currentNode=head;
//        while(currentNode.next.next!=null){
//            currentNode=currentNode.next;
//        }
//        currentNode.next=null;
//
//    }
//    public void deleteAtindex(int index){
//        if(index==0){
//            deleteFirst();
//            return;
//        }
//        Node currentNode=head;
//        int count=0;
//        while(currentNode.next!=null && count<index-1){
//            currentNode=currentNode.next;
//            count++;
//        }
//        currentNode.next=currentNode.next.next;
//    }
//
//    public void printList(){
//        Node currentNode=head;
//        while(currentNode!=null){
//            System.out.print(currentNode.data+ "->");
//            currentNode=currentNode.next;
//        }
//        System.out.print("null");
//        System.out.println();
//
//
//
//    }
//    public void search(int key){
//
//        Node currentNode=head;
//        int index=0;
//        boolean found=false;
//        while(currentNode!=null){
//            if(currentNode.data==key){
//                System.out.println("element is found at postion" +index);
//                found=true;
//                break;
//            }
//            currentNode=currentNode.next;
//            index++;
//        }
//        if(!found){
//            System.out.println("your provided element is not founded at index");
//        }
//    }
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//       Node currentNode = head;
//        while (currentNode.next != null) {
//            currentNode = currentNode.next;
//        }
//        currentNode.next = newNode;
//    }
//
//    public static Assignment2 merge(Assignment2 list1, Assignment2 list2){
//        Node a=list1.head;
//        Node b=list2.head;
//        Node dummy=new Node(0);
//        Node tail=dummy;
//        while(a!=null && b!=null){
//            if(a.data<b.data){
//                tail.next=a;
//                a.next=a;
//            }
//            else{
//                tail.next=b;
//                b.next=b;
//            }
//            tail=tail.next;
//        }
//        tail.next=(a!=null)? a:b;
//
//        Assignment2 merged= new Assignment2();
//        merged.head=dummy.next;
//        return merged;
//    }
//
//
//    public static void main(String[] args){
//        Assignment2 LL=new Assignment2();
//        LL.addFirst(3);
//        LL.addLast(4);
//        LL.addFirst(2);
//        LL.addLast(5);
//        LL.addFirst(1);
//        LL.addLast(7);
//        LL.addLast(8);
//        LL.addLast(9);
//        LL.insertAtIndex(6,5);
//        LL.deleteAtindex(7);
//        LL.printList();
//        Assignment2 list1=new Assignment2();
//        Assignment2 list2=new Assignment2();
//
//        list1.insert(44);
//        list1.insert(45);
//        list2.insert(46);
//        list2.insert(47);
//        System.out.println("Enter element to search");
//        Scanner sc=new Scanner(System.in);
//
////        System.out.println("Enter the position");
////        int index=sc.nextInt();
////        System.out.println("Enter the data");
////        int data=sc.nextInt();
////        System.out.println("the position is"+ index + "the data is "+data);
//          int key=sc.nextInt();
//          LL.search(key);
//
//          Assignment2 merged=merge(list1,list2);
//          merged.printList();
//
//
//    }
//}

// Remove duplicate values

public class Assignment2{
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    public void add(int data){
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
        newNode.prev=currentNode;
    }
    public void display(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data +" ->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

//    public void removeDuplicates() {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node current = head;
//        while (current!=null &&current.next != null) {
//            if (current.data == current.next.data) {
//                Node nextNode = current.next;
//                current.next = nextNode.next; // skip duplicate
//                if (nextNode.next != null) {
//                    nextNode.next.prev = current; // fix backward link
//                }
//            } else {
//                current = current.next; // move ahead
//            }
//        }
//    }
    public void removeDuplicates(){
       if(head==null){
           System.out.println("List is empty");
            return;
       }
       Node current=head;
       while(current!=null && current.next!=null){
           if(current.data==current.next.data){
               Node nextNode=current.next;
               current.next=nextNode.next;
               if(nextNode.next!=null){
                   nextNode.next.prev=current;
               }
           }
           else{
               current=current.next;
           }
       }

    }

    public static void main(String[] args) {
        Assignment2 ll = new Assignment2();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        ll.display();
        ll.removeDuplicates();
        ll.display();

    }
}
