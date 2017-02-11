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
        int pos = 0;

        //if items are present - compare new item with each item, insert at pos where new item
        // is of higher priority (lesser number) than higher number
        for(int i = 0; i < pqArray.length; i++) {
            if(item < pqArray[i]) {
                pos = i;
                break;
            }
        }
        for(int j = pos; j < pqArray.length; j++) {
            //shift higher items up
            pqArray[j+1] = pqArray[j];
        }
        //add item at pos
        pqArray[pos] = item;

        //increment nItems;
        nItems++;

    }
}


public class PriorityQueueMain {
}
