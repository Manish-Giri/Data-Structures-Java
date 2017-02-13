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
    private class LinkedList {
        //reference to first link in list
        private Link first;
        //reference to last link in list
        private Link last;

        //constructor
        LinkedList() {
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

        

    }
}
