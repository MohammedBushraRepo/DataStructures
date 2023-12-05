import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //*********************************************************************************************
    //addLast
    public void addLast(int item) {
        var node = new Node(item);
        // we should check if the lis is empty or Not
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

        //increment size
        size++;

    }

    //***************************************************************************************
    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        // we should check if the lis is empty or Not
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            first.next = node;
            first = node;
        }

        //increment size
        size++;
    }

    // to Make code clean extract repetitive code into a method
    private boolean isEmpty() {
        return first == null;
    }

//***************************************************************************************

    //indexOf
    public int indexOf(int item) {
        //We dont have indexes here , how we trace the index
        int index = 0; // first create variable index and set it 0
        var current = first; //second we need another variable and set to current node
        /* as long as current is not null , that mean we haven't reach the end of the list, we
        we need to compare the current node with this item
        * */
        while (current != null) {
            if (current.value == item) return index;
            //otherwize we need to set current to next node
            current = current.next;
            index++;
        }
        //if we reach the end without finding any value return -1
        return -1;

    }

    //***************************************************************************************

    //Contains ==> similar to indexOf Method
    public boolean contains(int item) {
        // to shortcut the method in one line
        //return indexOf(item) != -1
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
            index++;
        }
        return false;

    }

    //***************************************************************************************
    //removeFirst
    public void removeFirst() {
        /* problem => we need to remove the node and the link in oreder to make
        garpage collector to remove the node from memory also by this we will lose the track of the second point
        solve:= we need two different references first and second
        */
        //handele exception if list is empty
        if (isEmpty())
            throw new NoSuchElementException();
        // if the list include one node
        if (first == last)
            first = last = null;
        else {

            //[10 -> 20 -> 30]
            var second = first.next;
            first.next = null;
            //[20 -> 30]
            first = second;
        }
        //decrement size
        size--;
    }

//***************************************************************************************

    //removeLast
    public void removeLast() {

        //handele exception if list is empty
        if (isEmpty())
            throw new NoSuchElementException();
        // if the list include one node
        if (first == last)
            first = last = null;
        else {
            //[10 -> 20 -> 30]
            var previous = getPreviousNode(last);  //previous -> 20
            last = previous;  // last -> 20
            last.next = null;  //shrink the list
        }
        //decrement  size
        size--;
    }

    //find the previous node
    private Node getPreviousNode(Node node) {
        var current = first; // to make index
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;

    }
//***************************************************************************************

    //Size Method
    public int size() {
        /*we can iterate over the list from first to last and increment counter
         * variable , but assuming we had large number of nodes lets say 10000000
         * instead we will declare a private field in this class "Size" and every time we insert
         * node we will increment the size number and decrement when removing node*/
        return size;
    }
//***************************************************************************************

    //Method to convert list a regular java array
    public int[] toArray() {
        int[] array = new int[size];//create regular array instance and let  have the size
        //we to traverset this list as we add new items in this array
        var current = first;
        var index = 0; //keep track of the index
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.next;
        }
        return array;
    }

    //***************************************************************************************
    //reverse a list
    /* we should start from the begening grab the first two node and change the directions
     * we need two variable to referance previous p and current node c
     * also we need variable index n to keep track the .next node wile we referance the current node
     * [10 -> 20 -> 30 ] -> [10 <- 20  30]
     *                       p      c   n*/
    public void reverse() {
        if (isEmpty()) return;

        //reverse node links logic
        var previous = first;
        var current = first.next;

        //reverse the direction of the node links logic
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        //reverse first node
        last = first;
        last.next = null; //to remove links

        // reverse  last nodes points
        first = previous; //to refernce the last node after iteration


    }


    //***************************************************************************
    /*find the Kth Node from the end in linkedList in one pass
     * [10 -> 20 -> 30 -> 40 -> 50]
     *               *           *
     * k = 1 (50)
     * k = 2 (40)
     * k = 3 (30)
     * in this kind of answers you should try to simplify it
     * instead of starting from last node you should pick more simple like
     * for example node k = 3*/

    public int getKthFromTheEnd(int k) {
        if(isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;
        // to b forward to be in the right distance from a
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        //to move pointer for ward to make the reach the end of list
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;

    }

}

