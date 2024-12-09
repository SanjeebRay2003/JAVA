package Advance_Java.Collection_Framework.Queue;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDq = new ArrayDeque<>();

        arrDq.offer(10);
        arrDq.offer(20);
        arrDq.offer(30);

        // Adding the elements from Front and Back
        arrDq.offerFirst(100);
        arrDq.offerLast(200);
        System.out.println(arrDq);

        // these three are use for getting the next element for delete
//        System.out.println(arrDq.getFirst());
//        System.out.println(arrDq.getLast());
//        System.out.println(arrDq.peek()); // peek shows next deletion element from front only (by default)
        System.out.println("Next deletion element from front : "+arrDq.peekFirst());
        System.out.println("Next deletion element from Back : "+arrDq.peekLast());

        // for Deleting element from Front and Back
        arrDq.pollFirst();
        arrDq.pollLast();

        System.out.println(arrDq);



    }
}
