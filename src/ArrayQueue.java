import java.util.Arrays;

public class ArrayQueue {
    //first Create An Array with 5 items
    private  int[] items ;
    private int rear;
    private int front;
    private int count;


    //initialise capacity with constructor
    public ArrayQueue(int capacity) {
        items =new int[capacity];
    }

    //enqueue Method
    public void enqueue(int item){
        if (count == items.length)
            throw new IllegalStateException();
        //first we need the pointer that determine where in the array we should put the item (rear)
        //we need another field to keep track the number of items in queue (count)
        items[rear]=item;
        rear = (rear + 1) % items.length;

        count++;//also we need increment count variable

    }

    //dequeue
    public int dequeue(){
        //we simply remove and return items from the queue,we need another pointer (front)
        //return items[front++]; // returning items of front and increment front variable
        //we need to clear items in this position and set it to zero because this will make it easier to visualize
        var item = items[front];
        items[front] = 0;
        front  = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }


    /*lets assume we removed two items on the front the queue will look like
    * [0,0,30,40,50]
    *                R*
    so the rear pointer who reference the last item , when we add new item the rear will go
      out of the boundaries of the queue , to solve this issue we will use circular array by connecting
      * the end of this array by its beginning /

     * new R = 5 -> 0
     *         6 -> 1
     *         7 -> 2      Left/Length
     *         8 -> 3
     *         9 -> 4
     *         10 -> 0
     *         11 -> 1
     *         (rear + 1) / Length
     * look at front and rear on the code */
}
