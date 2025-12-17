package CircularLinkedList;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        CircularLinkedList<String> list = new CircularLinkedList<String>();
        list.addFirst("Tasneem");
        list.addFirst("Basem");
        list.addFirst("Mohammed");
        list.addFirst("ghaleb");
        list.removeFirst();
        list.removeLast();
        list.display();










    }
}
