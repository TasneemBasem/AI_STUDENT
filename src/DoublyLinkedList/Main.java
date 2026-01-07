package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
    DoublyLinkedList<String> dlist= new DoublyLinkedList<String>();
    dlist.addFirst("Maria");
    dlist.addFirst("Tasneem");
       dlist.addFirst("Bushra");
        dlist.addFirst("Alanood");
        dlist.removeFirst();
       // dlist.removeFirst();
        dlist.display();

    }
}

