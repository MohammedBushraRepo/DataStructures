import java.util.Arrays;

public class PriorityQueue {
    /*we can use array or another data structure called heap
    * imaging we array with these numbers [1,3,5,7] , and now we want to insert(2) it will be [1,3,5,7,2]
    * but we need it here [1,2,3,5,7]
    * we should start from the beginning get the current item and compare it with the value that we want to insert
    * if this value is grater than the current item that means we should go forward because it should be inserted after current item
    * after finding the big item then insert the new value just before it and shift all other items to the rigth side
    * so will iterate from the back to sort items
    *  count - 1 for the last item in the array
    * --i */
    private int[] items = new int[5];
    private int count;

    public void add(int item){
      //validation
        if (count == items.length)
            throw new IllegalStateException ();

        //shifting  items
        int i; // declared outside the loop because we want its value

         for ( i = count - 1 ; i >= 0 ; i-- ) {// loop from the end  to the begenning
            // in each iteration get the item of the current index ,
            if(items[i] > item)//if it is greater than the new item
                items[i + 1] = items[i];// we shift the current item to right
            else
                break;
         }
         items[i + 1] = item; // assign the item to its sorted position
        count ++ ;
    }

    public int remove(){
        if (isEmpty())
            throw new IllegalStateException(); // check if  the queue is empty
        return items[--count]; //
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
