package ractice_23;

public class ArrayQueue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    ArrayQueue() {
        front = -1;
        rear = -1;
    }
    //
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    void clear(){
        front=-1;
        rear=-1;
    }
    int element(){
        return items[front];
    }
    // insert elements to the queue
    void enQueue(int element) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                // mark front denote first element of queue
                front = 0;
            }
            rear++;
            // insert element at the rear
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    int size(){
        return items.length;
    }

    int deQueue() {
        int element;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {

            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {

                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {

            System.out.println("\nFront index-> " + front);

            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");

            System.out.println("\nRear index-> " + rear);
        }
    }

}