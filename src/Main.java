

public class Main {
    public static void main(String[] args) {

        HashTable table = new HashTable();
        table.put(6,"A");
        table.put(8,"B");
        table.put(11,"C");
        table.put(6,"A+");
        System.out.println(table.get(6));

        /*CharFinder finder = new CharFinder();
        var ch = finder.findFirstRepeatingCharacter("green apple");
        System.out.println(ch);*/
        /* Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,2,3,3,4,2,2,5,8};
        for (var number : numbers)
            set.add(number);
        System.out.println(set);*/


     }




}


// find first non repeated character
// a green apple

        /*// to see the first non-repeated character
        CharFinder finder = new CharFinder();
       var ch = finder.findFirstNonRepeatingCharacter("a green apple");
       System.out.println(ch);
*/
        /*Map<Integer , String> map = new HashMap<>();
        map.put(1,"mohamed bushra");
        map.put(2,"molham hassan");
        map.put(3,"khalid mohamed");
        map.put(4,"alrasheed yahia");
        System.out.println(map);*/



    /*************************
     * Queues tests
    Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverseQueue(queue);
        System.out.println(queue);*/

//resversing a queue method
   /* public static void reverseQueue(Queue<Integer> queue){
        //first we remove items one by one and but it on stack
        // after the stack is empty we start removing items from the top of stack back to the Queue
        Stack<Integer> stack = new Stack<>();
        //first we remove items one by one and but it on stack
        while(!queue.isEmpty())
            stack.push(queue.remove());
        // after the stack is empty we start removing items from the top of stack back to the Queue
        while (!stack.isEmpty())
            queue.add(stack.pop());

    }*/



/*

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);

        while (!queue.isEmpty())
            System.out.println(queue.remove());

*/

       /* PriorityQueue queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
*/


        /*QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        var first = queue.dequeue();
        System.out.println(first);
*/

     /*ArrayQueue queue = new ArrayQueue(5);
     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);
  //   queue.enqueue(20);
    //   queue.dequeue();
    var front =  queue.dequeue();
  *//*   queue.dequeue();
     queue.enqueue(6);
     queue.enqueue(18);
     queue.enqueue(10);
     queue.dequeue();*//*
    // queue.enqueue(50);
        System.out.println(front);
        System.out.println(queue);*/






/**** stacks tests
 *  Stack stack = new Stack ();
 *         stack.push(10);
 *         stack.push(20);
 *         stack.push(30);
 *        stack.pop();
 *         stack.pop();
 *System.out.println(stack.isEmpty());
 *
 *
 *
 *
 *
 * Expression
 String str = "(1+2}";
 Expression exp = new Expression();
 var result = exp.isBalanced(str);
 System.out.println(result);

 String Reversal
 String str = "";
 StringReverser reverser = new StringReverser();
 var result =  reverser.reverse(str);
 System.out.println(result);*/


/*
//*************************Linked list tests
       test Add Last
        LinkedList list = new LinkedList();
     //   System.out.println(list.size());
        list.addLast(10);
       // System.out.println(list.size());
     //   list.addLast(20);
      //  list.addLast(30);
       // list.addLast(40);
      //  list.addLast(50);
     //list.reverse();
     //var result = list.toArray();
      //  System.out.println(list.getKthFromTheEnd(4));
        //System.out.println(Arrays.toString(result));
       // list.removeLast();
      //  list.removeFirst();
     //   System.out.println(list.size());
       // System.out.println(list.indexOf(40));
        // System.out.println(list.contains(30));
*/


/*
*************************************************arraystest
      // Array numbers = new Array(3);
     //  numbers.insert(10);
     //  numbers.insert(20);
     //  numbers.insert(30);
     //  numbers.insert(40);
      // numbers.remove(4);
     //   System.out.println(numbers.indexOf(200));
     //  numbers.print();*/