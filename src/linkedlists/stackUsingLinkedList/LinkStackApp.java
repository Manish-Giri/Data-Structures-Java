package linkedlists.stackUsingLinkedList;

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
            System.out.print("{" + iData + "} ");
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

        // stack pop - delete from front of list
        int deleteFront() {
            Link temp = first;

            // if LL empty
            if(isEmpty()) {
                return -1;
            }

            // else - if only one item in LL
            if(first.next == null) {
                first = null;
            }

            // else make next node as first
            else {
                first = first.next;
            }

            return temp.iData;

        }

        // display LL
        void displayList() {
            Link current = first;
            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }

    }

    /**
     * Class LinkStackInterface
     * simulates Stack by using LL and it's methods
     */

    private class LinkStackInterface {
        LinkedList linkedList = new LinkedList();

        // stack push operation - as visible to user
        void push(int item) {
            linkedList.insertFront(item);
        }

        // stack pop operation - as visible to user
        int pop() {
            return linkedList.deleteFront();
        }

        // display stack
        void display() {
            linkedList.displayList();
        }
    }


    public static void main(String[] args) {

        // create objects
        LinkStackApp stackApp = new LinkStackApp();
        LinkStackInterface stack = stackApp.new LinkStackInterface();

        // add 2 items
        stack.push(10);
        stack.push(20);

        // display
        // stack.display();

        // add 5 items
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        // display
        stack.display();

        // delete 2 items and display
        System.out.println("\nDeleted = " + stack.pop());
        System.out.println("Deleted = " + stack.pop());

        // display
        stack.display();


    }
}
