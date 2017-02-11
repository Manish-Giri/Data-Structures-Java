package stacksqueues;

/**
 * Created by manishgiri on 2/9/17.
 */

class PriorityQueue {

    //size of array
    private int maxSize;
    //array for PQ
    private int[] pqArray;
    //size of queue
    private int nItems;

    //constructor
    PriorityQueue(int size) {
        maxSize = size;
        pqArray = new int[maxSize];
        //number f items is 0 at first
        nItems = 0;
    }

    public void add(int item) {
        //if no items in queue, insert at pos 0
        if(nItems == 0) {
            pqArray[nItems] = item;
            nItems++;
        }
        
    }
}


public class PriorityQueueMain {
}
