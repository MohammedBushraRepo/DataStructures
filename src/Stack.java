import java.util.Arrays;

public class Stack {
      /*first create empty array and count varible to determine the index
      of the item that we are gonna set, after each we increment count by one
      *  */
      private int[] items = new int[5];
      private int count ;


      //push
      public void push(int item){
            if (count==items.length) // check if the stack is full
                  throw new StackOverflowError();
            items[count] =item;
            count++;
      }

      //pop
      public int pop(){
            if (count == 0)
                  throw new IllegalStateException();
            count--;
            return items[count];
      }

      @Override
      public String toString(){
            var content = Arrays.copyOfRange(items,0,count); // moving the content of stack to new array by its input size
            return Arrays.toString(content);
      }

      //Peek
      public int peek(){
            if (count == 0)
                  throw new  IllegalStateException();
            return items[count - 1];
      }

      //isEmpty
      public boolean isEmpty(){
            return count==0;
      }


}
