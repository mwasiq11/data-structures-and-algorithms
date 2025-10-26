import java.util.*;

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
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public boolean Palindrome(){
        Stack <Integer> stack=new Stack <> ();
        Node current=head;
        while(current!=null){
            stack.push(current.data);
            current=current.next;
        }
        current=head;
        while(current!=null){
            if(current.data!=stack.pop()){
                return false;
            }
            current=current.next;
        }
        return true;
    }
    public static void main(String[]args){

    Main list=new Main();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        if(list.Palindrome()){
            System.out.println("this is a Palindrome");
        }
        else{
            System.out.println("This is not a Palindrome");
        }
    }

}
