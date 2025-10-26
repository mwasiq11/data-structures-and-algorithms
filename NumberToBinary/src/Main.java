import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        Stack <Integer> stack=new Stack<>();

        while(num>0){
           int remainder=num%2;
           stack.push(remainder);
           num=num/2;
        }

        System.out.println("binary");
       while(!stack.isEmpty()){
           System.out.print(stack.pop());
       }

        sc.close();
    }
}
