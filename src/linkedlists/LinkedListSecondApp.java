package linkedlists;

/**
 * Created by manishgiri on 2/12/17.
 * implementation of a double ended list - with additions and deletions at front and end
 * NOTE - different from a doubly linked list
 */


public class LinkedListSecondApp {

    /**
     * class LINK to represent each link in the list
     */
    private class Link {
        int iData;

        //reference to next link in list
        Link next;

        Link(int idata) {
            iData = idata;
            //next link is null by default
            next = null;
        }

        private void displayLink() {
            System.out.print("{ " + iData + " }");
        }
    }

    /**
     * class LINKEDLIST to represent the list
     * double ended list - contain reference to FIRST and LAST link in list
     */
    private class DoubleEndedList {
        //reference to first link in list
        private Link first;
        //reference to last link in list
        private Link last;

        //constructor
        DoubleEndedList() {
            first = null;
            last = null;
        }

        //display items in list
        private void displayList() {
            System.out.println("List (first --> last) ");
            Link current = first;
            while(current != null) {
                current.displayLink();
                current = current.next;
            }
            System.out.println();
        }

        private boolean isEmpty() {
            return first == null;
        }

        /**
         * double ended list has access to first and last links, so LINKs can be added
         * to the front and the end
         */
        private void insertFirst(int key) {
            Link newLink = new Link(key);

            //if list is empty, last will refer to this link
            if(isEmpty()) {
                last = newLink;
            }
            newLink.next = first;
            first = newLink;
        }

        /**
         * insert at the end of the list
         */
        private void insertLast(int key) {
            Link newLink = new Link(key);
            //if list is empty, first will refer to newLink, and last is null
            if(isEmpty()) {
                first = newLink;
            }
            else {
                //if list is not empty, last is not null
                //old last's next to point to newLink
                last.next = newLink;

            }
            ////new last is this link - common in empty/non-empty list
            last = newLink;
        }

        /**
         * delete from front of list
         */
        private int deleteFirst() {
            //assumes non empty list
            int temp = first.iData;
            //if only 1 item in list, first/last will be null
            if(first.next == null) {
                last = null;
            }
            first = first.next;
            return temp;

        }

    }
}
