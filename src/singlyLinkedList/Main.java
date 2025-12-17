package singlyLinkedList;

public class Main {
    public static void main(String[] args) {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.addLast(10);
    list.addLast(5);
    list.addLast(1);
    list.addLast(90);
    list.removeFirst();
    list.removeLast();
    
    list.display();
    }
}
