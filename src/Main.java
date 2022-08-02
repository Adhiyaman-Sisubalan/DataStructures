import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //System.out.println("hello");
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        //list.addFirst(40);
        //list.addFirst(50);
        //list.removeLast();
        //list.indexOf(10);
        //list.removeFirst();
        list.reverse();
        var array =list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
