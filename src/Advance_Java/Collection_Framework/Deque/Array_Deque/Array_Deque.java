package Advance_Java.Collection_Framework.Deque.Array_Deque;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDq = new ArrayDeque<>();

        arrDq.add(10);
        arrDq.add(20);
        arrDq.add(30);

        arrDq.addFirst(1);
        arrDq.addLast(100);
        System.out.println(arrDq);

        // these three are use for getting the peek value or first value
        System.out.println(arrDq.getFirst());
        System.out.println(arrDq.peekFirst());
        System.out.println(arrDq.peek());

        // these three are use for getting the last value
        System.out.println(arrDq.getLast());
        System.out.println(arrDq.peekLast());

    }
}
