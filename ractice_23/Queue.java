package ractice_23;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        // Размер очереди: 5
        ArrayQueue q = new ArrayQueue();

        q.deQueue();

        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display();

        q.deQueue();

        q.display();
        System.out.println(q.element());
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
