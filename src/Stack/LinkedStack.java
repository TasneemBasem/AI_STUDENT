package Stack;


import singlyLinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {
    SinglyLinkedList<E> sList= new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return sList.isEmpty();
    }

    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void push(E data) {
      sList.first(data);
    }



    @Override
    public E top() {
        return sList.getFirst();
    }

    @Override
    public E pop() {
        return sList.removeFirst();
    }
}
