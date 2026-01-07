package Stack;

public class Main {
    public  static void main(String[] args){
        LinkedStack<Integer> lStack= new LinkedStack<Integer>();
        lStack.push(10);
        lStack.push(20);
        lStack.push(30);
        lStack.push(40);
        lStack.push(50);
        System.out.println("the top element is = "+ lStack.top());

        while (!lStack.isEmpty()){
            System.out.println("element removed: "+ lStack.pop());
        }

        ArrayStack<Integer> to= new ArrayStack<Integer>();
        to.push(10);
        to.push(20);
        to.push(30);
        to.push(40);
        to.push(50);
        to.top();
        to.display();



    }
}
