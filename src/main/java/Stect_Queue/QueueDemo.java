package Stect_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Person 1");
        queue.offer("Person 2");
        queue.offer("Person 3");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("--------\n");
        System.out.println(queue.stream().findAny());
        queue.offer("Person 4");
        queue.offer("Person 5");
        System.out.println(queue);
        System.out.println("**--*-First*-*-*-*-*-*-*");
        System.out.println(queue.stream().findFirst());
        System.out.println("--**-*-*-*ANY-*-*-*-*");
        System.out.println(queue.stream().findAny());
        System.out.println(queue.peek());
    }
}
