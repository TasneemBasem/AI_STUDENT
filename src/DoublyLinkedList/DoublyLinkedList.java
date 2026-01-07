package DoublyLinkedList;

public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> tailer;
    private int size=0;



    public DoublyLinkedList() {
        header=new Node(null, null, null);
        tailer= new Node(header, null, null);
        header.setNext(tailer);

    }
    public boolean isEmpty(){
        return size==0;
    }
    public void addBetween(Node<E>left, E data, Node<E>right){
        Node<E> newNode= new Node(left, data, right);
        left.setNext(newNode);
        right.setPrev(newNode);
        size++;
    }
    public void addFirst(E data){
        addBetween(header, data, header.getNext());
    }
    public void addList(E data){
        addBetween(tailer.getPrev(),data, tailer);
    }
    public E getFirst(){
        if (isEmpty())return null;
        return header.getNext().getData();
    }
    public E getLast(){
        if(isEmpty())return null;
        return tailer.getPrev().getData();
    }
    private E remove(Node<E> deleteNode){
        if(header.getNext()== tailer)return null;
        E delete= deleteNode.getData();
        Node<E> left=deleteNode.getPrev();
        Node<E>  right= deleteNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;
}
public E removeFirst(){
        return remove(header.getNext());

}

public E removeLast(){
        return remove(tailer.getPrev());
}

public void display(){
         if (isEmpty()) {
             System.out.println("list is empty");
             return;
         }
        Node<E> temp= header.getNext();
        System.out.print("null<---- header <----->");
        while(temp != tailer)
        {
            System.out.print(temp.getData()+ "<----->");
            temp=temp.getNext();
        }
        System.out.print("tailer-----> null");



}



    class Node<E> {
        Node<E> prev;
        E data;
        Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
