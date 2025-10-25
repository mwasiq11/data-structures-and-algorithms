public class Stack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;


    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int popped=top.data;
        top=top.next;
        return popped;
    }
    public int peek(){
        if(isEmpty()){
         System.out.println("Stack is empty");
         return -1;
        }
        return top.data;
    }

    public void printStack(){
        Node current=top;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;

        }
        System.out.println();

    }
    public boolean isEmpty(){
        return top==null;
    }


    public static void main(String[] args){

        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int removed=stack.pop();
        System.out.println("Element removed is :" + removed);
        stack.peek();
        stack.printStack();
    }
}