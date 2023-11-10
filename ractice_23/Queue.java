package ractice_23;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        // create an object of Queue class
        ArrayQueue q = new ArrayQueue();
        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        q.deQueue();
        // insert elements to the queue
        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }
        // 6th element can't be added to queue because queue is   full
        q.enQueue(6);
        q.display();
        // deQueue removes element entered first i.e. 1
        q.deQueue();
        // Now we have just 4 elements
        q.display();
        System.out.println(q.Element());
        q.clear();
        q.display();
        ArrayQueueADT adt = new ArrayQueueADT();
        System.out.print("Queue is ");
        adt.out();
        int removedNumber = adt.dequeue();
        System.out.println("Removed Element: " +   removedNumber);
        System.out.print("Queue after deletion: ");
        adt.out();
        ArrayQueueModel first = new  ArrayQueueModel();
        java.util.Queue<Integer> numbers = new LinkedList<>();
        numbers.add(first.getA());
        numbers.add(first.getB());
        numbers.add(first.getC());
        System.out.println("Queue: " + numbers);
        removedNumber = first.dequeue(numbers);
        System.out.println("Removed Element: " +   removedNumber);
        System.out.println("Queue after deletion: " + numbers);
    }
}
