package ractice_23;

import java.util.Queue;
import java.util.LinkedList;
class ArrayQueueModel {
    private int a = 1;
    private int b = 2;
    private int c = 3;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public  Queue clear(Queue current){
        current.clear();
        return current;
    }
    public Queue enqueue(Queue current, int toAdd){
        current.add(toAdd);
        return current;
    }
    public int dequeue(Queue current){
        int toRes = (int) current.element();
        current.poll();
        return toRes;
    }
    public int size(Queue current){
        return current.size();
    }
    public boolean isEmpty(Queue current){
        return current.isEmpty();
    }

}