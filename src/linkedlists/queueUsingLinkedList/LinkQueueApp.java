package linkedlists.queueUsingLinkedList;

/**
 * Created by manishgiri on 6/16/17.
 * Implementation of a Queue using a LinkedList
 */
public class LinkQueueApp {

    /**
     * CLASS Link
     */
    private class Link {
        int data;
        Link next;

        // constructor
        Link(int data) {
            this.data = data;
            this.next = null;
        }

        // display each link
        void displayLink() {
            System.out.println(this.data + " ");
        }
    }

    /**
     * Class LinkedList to implement LL
     * insert at last, delete from front - requires two references to head and tail
     */
    private class LinkedList {

        private Link first;
        private Link last;

        
    }

}
