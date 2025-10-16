public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Merge two sorted linked lists

    static Main merge(Main list1,Main list2){
       Node a=list1.head;
       Node b= list2.head;

       Node dummy=new Node(0);
       Node tail=dummy;

       while(a!=null && b!=null){
           if(a.data<b.data){
               tail.next=a;
               a=a.next;
           }
           else{
               tail.next=b;
               b=b.next;
           }
           tail=tail.next;
       }
       tail.next=(a!=null)? a:b;

       Main merged=new Main();
       merged.head=dummy.next;
       return merged;
    }


    // Main method
    public static void main(String[] args) {
        Main list1 = new Main();
        Main list2 = new Main();

        // Create first sorted list
        list1.insert(1);
        list1.insert(4);
        list1.insert(7);

        // Create second sorted list
        list2.insert(2);
        list2.insert(5);
        list2.insert(8);
        list2.insert(10);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        // Merge both lists
        Main mergedList=merge(list1,list2);
        System.out.println("merged list");
        mergedList.printList();

    }
}
