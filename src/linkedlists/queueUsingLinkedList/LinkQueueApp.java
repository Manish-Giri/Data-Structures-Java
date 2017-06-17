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

        // constructor
        LinkedList() {
            first = null;
            last = null;
        }

        // check if LL is empty
        boolean isEmpty() {
            return first == null;
        }

        // insert at the end of queue
        void insertLast(int item) {
            Link newLink = new Link(item);

            // if LL is empty - first should be this new link
            if(isEmpty()) {
                first = newLink;
            }

            // else - add to next of current last
            else {
                last.next = newLink;
            }

            // make this newLink as new last
            last = newLink;
            
        }


    }

}
