package singlyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void first(E data) {
        Node<E> newNode = new Node(data, head);
        head = newNode;
        if (isEmpty())
            tail = newNode;
        size++;
    }

    public E getFirst() {
        if (isEmpty()) return null;
        return head.getData();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E delete = head.getData();
        head = head.getNext();
        if (isEmpty())
            tail = head;

        return delete;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node(data, null);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;

    }

    public E getLast() {
        if (isEmpty()) return null;
        return tail.getData();
    }

    public E removeLast() {
        E delete = tail.getData();
        if (isEmpty()) return null;
        if (head == tail) {
            head = null;
            tail = null;
        } else {

            Node<E> temp = head;
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }

            temp.setNext(null);
            tail = temp;
        }
        size--;
        return delete;
    }


    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ------> ");
            temp = temp.getNext();

        }
        System.out.println("null \n");
    }

    public E position(E data) {
        Node<E> temp = head;
        while (temp.getNext() != head) {
        }
        return data;
    }


    class Node<E> {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}












