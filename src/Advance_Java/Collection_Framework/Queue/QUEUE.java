package Advance_Java.Collection_Framework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

//        // For Add
//        q.add(12);
//        q.add(50);
//        q.add(40);
//        q.add(80);

        q.offer(12);
        q.offer(50);
        q.offer(40);
        q.offer(80);

        System.out.println(q);

        // for check which element is next for deletion
//        System.out.println("Next element for deletion is : "+q.element()); // it throws exception when queue is empty
        System.out.println("Next element for deletion is : "+q.peek()); // it give null value when queue is empty

        // for Delete
//        q.remove(); // it throws exception when queue is empty
        q.poll(); // it give empty queue when queue is empty
        System.out.println(q);


    }
}

/* we always use
    offer()
    poll()
    peek()
   for better code
 */
