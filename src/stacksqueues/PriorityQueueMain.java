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
    //pointer to front of PQ - highest priority item
    private int front;

    //constructor
    public PriorityQueue(int size) {
        maxSize = size;
        pqArray = new int[maxSize];
        //number f items is 0 at first
        nItems = 0;
        front = 0;
    }

    public void add(int item) {
        int j;
        //if no items in queue, insert at pos 0
        if(nItems == 0) {
            pqArray[nItems] = item;
            nItems++;
        }
        else {

            for(j = nItems-1; j >= 0; j--) {
                if(item > pqArray[j]) {
                    pqArray[j+1] = pqArray[j];
                }
                else {
                    break;
                }
            }
            pqArray[j+1] = item;

            //increment nItems;
            nItems++;
        }


    }

    /*public void add(int item) {
        if(nItems == 0) {
            pqArray[nItems++] = item;
        }
        else {
            int i;
            for(i = 0; i < nItems; i++) {
                if(item < pqArray[i]) {
                    for(int j = nItems-1; j >= i; j--) {
                        pqArray[j+1] = pqArray[j];
                    }
                    pqArray[i] = item;
                    break;
                }
                else {
                    pqArray[i+1] = item;
                }
            }

            //pqArray[i+1] = item;
            nItems++;

        }
        System.out.println("number of items = " + nItems);

    }*/



    public int remove() {
        return pqArray[--nItems];
    }

    public int peek() {
        return pqArray[nItems-1];
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void display() {
        System.out.println("The items in queue are - ");
        for(int x = 0; x < pqArray.length; x++) {
            System.out.print(pqArray[x] + " ");
        }
    }
}


public class PriorityQueueMain {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        pq.add(30);
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(20);

        pq.display();

        System.out.println("Highest priority item = " + pq.peek());

        //delete one item
        System.out.println("Deleted = " + pq.remove());

        System.out.println("Highest priority item = " + pq.peek());

        //delete one item
        System.out.println("Deleted = " + pq.remove());

        System.out.println("Highest priority item = " + pq.peek());





    }
}
