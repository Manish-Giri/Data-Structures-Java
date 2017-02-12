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

    }

    public static void main(String[] args) {

    }
}
