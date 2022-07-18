public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int num){
        if(first.getValue() != 0){
            first.setNext(num);
        }
    }
}
