package linkedlists;

/**
 * Created by manishgiri on 2/11/17.
 */

public class LinkedListFirstApp {

    private class Link {
        int iData;
        double dData;
        //reference to next link in list
        Link next;

        Link(int idata, double ddata) {
            iData = idata;
            dData = ddata;
            //next link is null by default
            next = null;
        }

        private void displayLink() {
            System.out.println("{ " + iData + " " + dData + " }");
        }
    }

    private class LinkedList {
        //reference to first link in the list
        Link first;

        LinkedList() {
            first = null;
        }

        private boolean isEmpty() {
            //if list is empty, first will still be null
            return first == null;
        }


        /**
         * create new Link object, point next field of this link to current first
         * make current first point to this link
         * @param i
         * @param d
         */
        private void insertFront(int i, double d) {
            Link newLink = new Link(i, d);
            newLink.next = first;
            first = newLink;

        }

        /**
         * delete current first link - make first point to next field of current first
         * @return
         */
        private Link deleteFront() {
            Link temp = first;
            first = first.next;
            return temp;
        }

        /**
         * display all links in list
         * start current at first, display data of first and make current point to next of first
         * repeat until current.next is not null
         */
        private void displayList() {
            System.out.println("List (first ---> last)");
            Link current = first;
            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {

        LinkedListFirstApp app = new LinkedListFirstApp();

        LinkedListFirstApp.LinkedList linkedList = app.new LinkedList();
        //insert 4 items
        linkedList.insertFront(22, 2.99);
        linkedList.insertFront(44, 4.99);
        linkedList.insertFront(66,6.99);
        linkedList.insertFront(88, 8.99);

        //display list
        linkedList.displayList();

        //delete all items one by one
        while (!linkedList.isEmpty()) {
            Link deleted = linkedList.deleteFront();
            System.out.println("Deleted --- ");
            deleted.displayLink();
        }

        linkedList.displayList();



    }
}
