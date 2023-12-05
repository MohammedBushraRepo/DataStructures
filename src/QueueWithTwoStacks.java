import java.util.Stack;

public class QueueWithTwoStacks {
    /*Build queue using Stack
     * the queue work opposite of stack
     * in order to work with this we need to make two stacks to move items around and change order
     * Q [40,50]
     * S1[40,50]   enqueue
     * S2[50,40]   dequeue
     * */
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
      stack1.push(item);
    }

    public int dequeue(){
       //if the one of stacks is empty we need to throw an exception
        if (isEmpty())
            throw new IllegalStateException();


        // we need to check if stack 2 is empty before moving items from stack 1 to stack two
        moveStack1ToStack2();

        return stack2.pop();
    }
    public boolean isEmpty(){
       return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek(){
        //if the one of stacks is empty we need to throw an exception
        if (isEmpty())
            throw new IllegalStateException();


        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        // we need to check if stack 2 is empty before moving items from stack 1 to stack two
        if(stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
    }


}
