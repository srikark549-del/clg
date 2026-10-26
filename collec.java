import java.util.LinkedList;

public class collec {
    public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
        list.add(50);
        System.out.println("Initial :"+list);
        list.removeFirst();
        System.out.println("After removing first element"+list);
        list.removeLast();
        System.out.println("After removing last element"+list);
        list.remove(1);
        System.out.println("After removing 2nd index element"+list);
    }
}