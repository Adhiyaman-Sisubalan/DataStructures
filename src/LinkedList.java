import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private boolean isEmpty(){
        return first == null;
    }
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next =first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
        }else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
        }else {
        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;
        }
        size--;
    }

    public boolean contains(int item){
       return indexOf(item) != -1;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null){
            array[index++]  = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        //[10 -> 20 -> 30]
        //  p    c     n
        //[10 <- 20 <- 30]
        if(isEmpty()) return;

        var previous = first;
        var current = first.next;
        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        last = first;
        last.next = null;
        first = previous;
    }

    /*public int[] toArray(LinkedList list){
        ArrayList<Integer> arr = new ArrayList<>();
        for (var item :
                list) {
            arr.add(list. )
        }
    }*/
}
