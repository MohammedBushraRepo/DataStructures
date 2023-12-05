
public class Array {
    private int[] items ;
    private int count;
    public Array(int length) {
        items = new int[length];
    }


    public void insert(int item){
        //if the array is full , resize it
        if(items.length == count){
            //create New Array(twice a size)
            int[] newItems = new int[count * 2];
            //copy All Existing items
            for (int i=0 ; i < count ; i++)
                newItems [i] = items[i];
            //Set items to this New Array
            items = newItems;
        }
        //Add the New item in the end of the array
        items[count] = item;
        count ++;

    }

    public void remove(int index){
        //Validate the index (not negative and not bigger than array lenght)
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        //shift items to the left to fill the hole
        //[10,20,30,40]
        //index : 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index ; i < count ; i++)
            //to set item of index to item index to the item in the right side
            items[i] = items[i + 1];
        //to shrink back the array
            count--;
    }
    public int indexOf(int item){
        //loop over the whole array , if we find it return the index
        //Otherwise return -1
        for(int i=0 ; i < count ; i++)
            if(items[i]==item){
                return  i;
            }
        return -1;

    }
    public void print(){
        //loop on all array items and print them
        for (int i = 0; i < count ; i++){
            System.out.println(items[i]);
        }
    }

}
