package linkedlists;

/**
 * Created by manishgiri on 2/18/17.
 * implementation of a stack using a linked list
 */

public class LinkStackApp {

    /**
     * Link class
     */
    private class Link {
        private int iData;
        private Link next;

        Link(int data) {
            iData = data;
            next = null;
        }

        private void displayLink() {
            System.out.println("{ " + iData + " }");
        }
    }

    /**
     * LinkedList class
     * @param
     */

    private class LinkedList {
        // a stack needs only a reference to the first link
        private Link first;

        LinkedList() {
            first = null;
        }

        // check if LL is empty
        boolean isEmpty() {
            return first == null;
        }

        // stack push - insert at front of list
        void insertFront(int data) {
            Link newLink = new Link(data);

            // if LL empty - newNode is first
            if(isEmpty()) {
                first = newLink;
            }

            // else - change references to make this as first
            else {
                newLink.next = first;
                first = newLink;
            }
        }

        
    }


    public static void main(String[] args) {

    }
}
