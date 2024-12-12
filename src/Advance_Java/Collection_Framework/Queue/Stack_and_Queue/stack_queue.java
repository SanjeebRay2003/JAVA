package Advance_Java.Collection_Framework.Queue.Stack_and_Queue;

import java.util.ArrayDeque;

public class stack_queue {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
//        queue.offerFirst(50);
        queue.push(40);
        System.out.println(queue);
        System.out.println(queue.peek());
//        queue.poll();
        queue.pop();
        System.out.println(queue);

        System.out.println();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.offer(400);
        System.out.println(stack);
        System.out.println(stack.peek());
//        stack.pop();
        stack.poll();
        System.out.println(stack);


    }
}

/* stack and queue store their data in different forms but it shows in differ form
    queue -> 1,2,3,4,5
    stack -> 5,4,3,2,1
 */
