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


    public static void main(String[] args) {

    }
}
