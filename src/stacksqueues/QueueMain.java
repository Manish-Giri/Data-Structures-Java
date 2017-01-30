package stacksqueues;

/**
 * Created by manishgiri on 1/29/17.
 * implementation of a circular queue where the REAR wraps around the FRONT to improve efficiency
 * In a NON CIRCULAR queue, if a few items are deleted from the top, FRONT moves up, and when REAR is
 * at the max capacity, no more items can be added to the queue even though there is room
 */

class Queue {

    //member variables
    //max sixe of queue
    private int maxSize;
    //array to implement queue with
    private int[] queueArray;
    //pointer to front of queue - where items will  be removed from
    private int front;
    //pointer to rear of queue - where items will be inserted into
    private int rear;
    //number of items in queue
    private int nItems;

    //constructor
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        //at the start, there would be no items in queue
        nItems = 0;
        //and front will be at 0 (by default)
        front = 0;
        //and rear will be at -1
        rear = -1;
    }

    //queue methods - insert, remove, isEmpty, isFull, peekFront, size

}
public class QueueMain {
}
