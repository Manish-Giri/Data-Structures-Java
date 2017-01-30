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
    public void insert(int item) {
        //for a circular queue, REAR should wraparound to 0 if there is space in queue
        //check if REAR is at maxsize already
        if(rear == maxSize - 1) {
            //setup rear to -1, such that next item inserted will be at 0
            rear = -1;
        }

        //to add an item to queue, first incrememnt rear, then add item at that position in array
        //TODO: //test with single line notation
        rear++;
        queueArray[rear] = item;

        //increment number of items in queue
        nItems++;

    }


    /**
     * remove item at FRONT of queue
     * @return
     */
    public int remove() {

        int removed = queueArray[front];
        //incrememnt front
        front++;
        //circular queue - when FRONT is at maxsize, it should wraparound to 0
        //TODO: why not maxSize-1?
        if(front == maxSize) {
            front = 0;
        }
        //decrease number of items in queue
        nItems--;
        return removed;
    }

    /**
     * return the item at the front of the queue, without removing it
     * @return
     */
    public int peekFront() {
       return queueArray[front];
    }

    /**
     * return the item at the rear of the queue, without removing it
     * @return
     */
    public int peekRear() {
        return queueArray[rear];
    }

    /**
     * check if queue is empty
     * @return
     */
    public boolean isEmpty() {
        return nItems == 0;
    }

    /**
     * check if queue is full
     * @return
     */
    public boolean isFull() {
        return nItems == maxSize;
    }

    /**
     * return current size of queue
     * @return
     */
    public int size() {
        return nItems;
    }

}
public class QueueMain {

    public static void main(String[] args) {
        //create Queue with size 5
        Queue queue = new Queue(5);

        //insert 4 items
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        //check item at front
        System.out.println(queue.peekFront());
        //check item at rear
        System.out.println(queue.peekRear());
    }
}
