public class Main{
   static class vowel{
       char [] stackArr;
       int top;

       vowel(int size){
           this.top=-1;
           this.stackArr=new char [size];
       }

       boolean isEmpty(){
           return top==-1;
       }

       boolean isFull(){
           return top==stackArr.length-1;
       }

       public void push(char ch){
           if (isFull()) {
                System.out.println("Stack Underflow!");
                return ;
            }
           stackArr[++top]=ch;
       }

       public char pop(){
           if(isEmpty()){
               System.out.println("Stack Underflow!");
           }
           return stackArr[top--];
       }
       public void display(){
           for(int i=0;i<=top;i++){
               System.out.print(stackArr[i]+" ");
           }
       }
   }
    public static void main(String[] args){
       vowel s1=new vowel(5);
        vowel s2=new vowel(5);
        vowel s3=new vowel(5);

        String input="aeiou";
        for(int i=0;i<input.length();i++){
            s1.push(input.charAt(i));
            System.out.print(" ");
        }
        s1.display();

        while(!s1.isEmpty()){
            s2.push(s1.pop());
            System.out.print(" ");

        }
        s2.display();

        while(!s2.isEmpty()){
            s3.push(s2.pop());
            System.out.print(" ");

        }
        s3.display();

    }
}
