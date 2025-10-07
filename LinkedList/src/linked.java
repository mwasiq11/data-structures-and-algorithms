import java.util.*;

public class linked {
    static void main(String[] args) {
        LinkedList <String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);
        // size of linked list//
        System.out.println(list.size());
        // by forEach loop
//        for (String List:list){
//            System.out.print( List + " ");
//        }
        // by for loop//
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

    }
}
