package ractice_23;
import java.util.Queue;
import java.util.LinkedList;
public class ArrayQueueADT {
    Queue number = new LinkedList<>();
    public  Queue clear(Queue current){
        current.clear();
        return current;
    }
    public ArrayQueueADT(){
        this.number.add(15);
        this.number.add(52);
        this.number.add(8);
    }
    public Queue enqueue(int toAdd){
        this.number.add(toAdd);
        return number;
    }
    public  Queue getNumber(){
        return this.number;
    }
    public int dequeue(){
        int toRes = (int) this.number.element();
        this.number.poll();
        return toRes;
    }
    public int size(){
        return this.number.size();
    }
    public boolean isEmpty(){
        return this.number.isEmpty();
    }
    public void out(){
        System.out.println(this.number);
    }

}